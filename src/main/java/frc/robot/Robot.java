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
import java.util.Set;

public class Robot extends LightningRobot {

    public static final boolean DRIVETRAIN_LOGGING_ENABLED = true;

    public Robot() {
        super(getRobot());
    }

    @Override
    public void robotInit() {
        super.robotInit();

        Set<String> names = getContainer().getAutonomousCommands().keySet();
        for(var name : names) {
            registerAutonomousCommmand(name, getContainer().getAutonomousCommands().get(name));
            System.out.println("Registered " + name + " command for auton");
        }
        
    }

    @Override
    public void teleopInit() {
        super.teleopInit();
        // getContainer().getDrivetrain().resetSensorVals();
    }

    @Override
    public void autonomousInit() {
        super.autonomousInit();
        // getContainer().getDrivetrain().resetSensorVals();
    }

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
