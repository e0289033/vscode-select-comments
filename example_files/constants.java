// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public final class CatapultPivot
  {
    public static final int kMotorAPort = 2; // M4 - CatapultPivotA
    public static final int kMotorBPort = 3; // M5 - CatapultPivotB

    public static final int kP = 1;
    public static final int kI = 0;
    public static final int kD = 40;
    public static final int kF = 0;

    public static final int kAcceleration = 2048;
    public static final int kCruiseVelocity = 1024;
    public static final int kCurveStrength = 0;

    public static final int kPosTol = 60;
  }
  public final class CatapultExtension
  {
    public static final int kLowerSolenoidA = 4;
    public static final int kLowerSolenoidB = 5;

    public static final int kUpperSolenoidA = 2;
    public static final int kUpperSolenoidB = 3;
  }

  public final class CatapultClaw 
  {
    public static final int kClawSolenoidA = 0;
    public static final int kClawSolenoidB = 1;
  }

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public final class DriveTrain {

    public static final double kGyroTimeConstant = 0.01;

    public static final double kDistancePerPulse = 3.24/13660;
    public static final double kTrackWidth = .69;
    public final class Light{
      public static final int kBumperSwitch = 5;
      public static final int kLightChannel = 4;
    }

    /** Position closed loop parameters */
    public final class TurnPosCL {
      public static final double kMaxVel = 200;
      public static final double kMaxAcc = 200;
      public static final double kP = 1.5;
      public static final double kPosTol = 2;
      public static final double kVelTol = 1;
    }

    /** Velocity closed loop parameters */
    public final class TurnVelCL {
      public static final double kP = .25 / 180;
      public static final double kI = 0;
      public static final double kD = 0.012 / 180;
      public static final double kF = 1.0 / 275;
    }

    /** Velocity open loop parameters */
    public final class TurnVelOL {
      public static final double kMaxVel = 200;
      public static final double kMaxAcc = 400;
    }

    /** Drive closed loop parameters */
      public final class DriveVelCL {
        public static final double kP = 0.2;
        public static final double kI = 0.0;
        public static final double kD = 0.01;
        public static final double kF = 0.0;

        public static final double kMaxSpeed = 1.0;
        public static final double kMaxAcc = 2.0;
        
    }
  
    /*Wiring parametres */
    public final class Wiring {
      public static final int kMotorLeftAId = 15;  // M0 - DTLeftA
      public static final int kMotorLeftBId = 14;  // M1 - DTLeftB
      public static final int kMotorRightAId = 13; // M2 - DTRightA
      public static final int kMotorRightBId = 12; // M3 - DTRightB

      public static final int kLeftEncoderPortA = 3;
      public static final int kLeftEncoderPortB = 4;

      public static final int kRightEncoderPortA = 0;
      public static final int kRightEncoderPortB = 1;
    }
  }  
}
