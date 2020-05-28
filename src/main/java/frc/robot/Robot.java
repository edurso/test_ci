/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.lightning.LightningContainer;
import frc.lightning.LightningRobot;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Robot extends LightningRobot {

    public Robot() { super(getRobot()); }

    private static LightningContainer getRobot() {
        return null;
    }

    public static boolean isNebula() {
        return Files.exists(Paths.get("/home/lvuser/nebula"));
    }

    public static boolean isTwiki() {
        return Files.exists(Paths.get("/home/lvuser/twiki"));
    }

    public static boolean isQuasar() {
        return Files.exists(Paths.get("/home/lvuser/quasar"));
    }

    public static boolean isIllusion() {
        return Files.exists(Paths.get("/home/lvuser/illusion"));
    }

    public static boolean isGreg() {
        return !(isNebula() || isTwiki() || isIllusion() || isQuasar());
    }

}
