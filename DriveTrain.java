// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  Victor frontLeft;
  Victor frontRight;
  Victor rearLeft;
  Victor rearRight;

MecanumDrive m_robotDrive;


  /** Creates a new DriveTrain. */
  public DriveTrain() {

  
    VictorSP frontLeft = new VictorSP(Constants.LEFT_FRONT);
    VictorSP rearLeft = new VictorSP(Constants.LEFT_BACK);
    VictorSP frontRight = new VictorSP(Constants.RIGHT_FRONT);
    VictorSP rearRight = new VictorSP(Constants.RIGHT_BACK);

    frontRight.setInverted(true);
    rearRight.setInverted(true);

    m_robotDrive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void drivewithjoysticks(XboxController controller, double speed)
  {
    m_robotDrive.driveCartesian(controller.getLeftY(), -controller.getRightX(), controller.getRightY());
  }
  public void driveForward(double speed)
  {

  }

  public void stop()
  {

  }
}