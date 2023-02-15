package frc.robot.subsystems;
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.



import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Intake extends SubsystemBase {

Servo exampleServo1;
Servo exampleServo2;

 public Intake() {

  

  exampleServo1 = new Servo(Constants.SERVO_ONE);
  exampleServo2 = new Servo(Constants.SERVO_TWO);

   
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void drivewithjoysticks(XboxController controller, double speed)
  {
    if (controller.getLeftBumper()){
        exampleServo1.setPosition(1);
        exampleServo2.setPosition(0);
      
      } else if(controller.getRightBumper()){
        exampleServo1.setPosition(0.3);
           exampleServo2.setPosition(0.7);
          
     
      } else {
        exampleServo1.setPosition(0.5);
           exampleServo2.setPosition(0.5);
    }
  }
 
}