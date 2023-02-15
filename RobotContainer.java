// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Solenoid;




/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  Compressor Comp = new Compressor( PneumaticsModuleType.CTREPCM);


  // The robot's subsystems and commands are defined here...
  

  private final DriveTrain driveTrain;
  private final Intake intake;
  private final Solenoid solenoid;
  

  
 
 

 
  private Drivewithjoysticks drivewithjoysticks;
  //private final AutoCommand AutoCommand;
  public static XboxController driverjoystick;
  

 



  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    
 
    driveTrain = new DriveTrain();
    intake = new Intake();
    solenoid = new Solenoid();
   
    
    

    
   
   
    drivewithjoysticks = new Drivewithjoysticks(driveTrain, solenoid, intake);

    
    /* 
    = new AutoCommand(driveTrain, liftDrive, intake);
    AutoCommand.addRequirements(driveTrain);
   
*/
    driverjoystick = new XboxController(0);

   
  
    drivewithjoysticks.addRequirements(intake);
    drivewithjoysticks.addRequirements(driveTrain);
    drivewithjoysticks.addRequirements(solenoid);
   
    
    
    solenoid.setDefaultCommand(drivewithjoysticks);
    intake.setDefaultCommand(drivewithjoysticks);
    driveTrain.setDefaultCommand(drivewithjoysticks);


 
  

    // Configure the button bindings
    configureButtonBindings();
  
  
  }
 
  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
   
    
  }

public Command getAutonomousCommand() {
    return null;
}

  /*
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */


  // public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
  
  //}
}