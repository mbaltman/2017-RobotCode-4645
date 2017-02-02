package org.usfirst.frc.team4645.robot.subsystems;

import org.usfirst.frc.team4645.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;


/**
 *
 */
public class Reservoir extends Subsystem {

    public Servo servo1 = RobotMap.reservoirServo;

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void spinIn()
    {
    		
    		servo1.set(1);
    }
    
    public void spinOut()
    {
    		servo1.set(.5);
    }
  
   
}
