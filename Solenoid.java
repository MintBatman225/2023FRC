

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Solenoid extends SubsystemBase {


  DoubleSolenoid Armsolenoid;

  public Solenoid(){
  
    Armsolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
  }
 
  



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drivewithjoysticks(XboxController controller){

    if(controller.getAButtonPressed()){

    Armsolenoid.set(Value.kForward);

}   else if (controller.getAButtonReleased()){

    Armsolenoid.set(Value.kReverse);
   
} else {
    Armsolenoid.set(Value.kOff);
}
  }

}
