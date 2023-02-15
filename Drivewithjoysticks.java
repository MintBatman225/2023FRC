package frc.robot;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Solenoid; 



public class Drivewithjoysticks extends CommandBase {
  private final DriveTrain driveTrain;
  private final Intake intake;
  private final Solenoid solenoid; 

  /** Creates a new Drivewithjoysticks. */
  public Drivewithjoysticks(DriveTrain dt, Solenoid sl, Intake in) {
    driveTrain = dt;
    intake = in;
    solenoid = sl; 
  
    addRequirements(driveTrain);
    addRequirements(intake);
    addRequirements(solenoid);

    // Use addRequirements() here to declare subsystem dependencies.

  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrain.drivewithjoysticks(RobotContainer.driverjoystick, Constants.DRIVETRAINSPEED);


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}