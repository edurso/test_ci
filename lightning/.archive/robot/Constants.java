/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.lightning.util.LightningMath;
import frc.lightning.util.RamseteGains;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

    // DEVELOPMENT
    public static final boolean TUNING_ENABLED = true;

    // HARDWARE
    public static final double TICS_PER_ROTATION = 2048; // 4 * 360;
    public static final double NEO_TICKS_PER_REV = 42;
    public static final int NEO_MAX_RPM = 5700;

    // DRIVETRAIN
    // public static final RamseteGains ROBOT_NAME = new RamseteGains();
    public static final double VOLT_LIMIT = 12d;
    public static final double WHEEL_DIAMETER_INCHES = 6;
    public static final double WHEEL_CIRCUMFERENCE_INCHES = WHEEL_DIAMETER_INCHES * Math.PI;
    public static final double GEAR_REDUCTION = 15;
    public static final double WHEEL_DIAMETER = 6;
    public static final int firstPCSensor = 0;
    public static final double ENCODER_PULSES_PER_REVOLUTION = 2048;
    public static final double ENCODER_PULSE_TO_METERS = LightningMath.in2meters(WHEEL_CIRCUMFERENCE_INCHES)
            / ENCODER_PULSES_PER_REVOLUTION;

    public static final RamseteGains TWIKI = new RamseteGains(0.5583711759, // trackWidth
            0.136, // kS
            2.51, // kV - 254 . . . these numbers must work!
            0.318, // kA
            0.121, // left_kP
            0d, // left_kI
            0d, // left_kD
            0.121, // right_kP
            0d, // right_kI
            0d, // right_kD
            5.4d, // maxVelocity (ft/sec)
            5d); // maxAcceleration (ft/sec^2)

}
