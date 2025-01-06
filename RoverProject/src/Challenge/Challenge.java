package Challenge;

import com.phidget22.*;

public class Challenge {
	public static void main(String[] args) throws Exception {
	     
		//Connect to wireless rover
		Net.addServer("", "192.168.100.1", 5661, "", 0);
	     
		//Create
	     DCMotor leftMotors = new DCMotor();
	     DCMotor rightMotors = new DCMotor();
	     
	     //Address
	     leftMotors.setHubPort(5);
	     leftMotors.setChannel(0);
	     rightMotors.setHubPort(5);
	     rightMotors.setChannel(1);
	     
	     //Open
	     leftMotors.open(7000);
	     rightMotors.open(7000);
	     
	     
	     //Move forward at full speed
	     leftMotors.setTargetVelocity(1);
	     rightMotors.setTargetVelocity(1);
	     //Wait for 1 second
	     Thread.sleep(1050);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	     
	     //Turn
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(1);
	     //Wait for 505milliseconds
	     Thread.sleep(710);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	    
	   //Move forward at full speed
	     leftMotors.setTargetVelocity(1);
	     rightMotors.setTargetVelocity(1);
	     //Wait for 1 second
	     Thread.sleep(1050);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	    
	     //Turn
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(1);
	   //Wait for 505milliseconds
	     Thread.sleep(710);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	    
	     leftMotors.setTargetVelocity(1);
	     rightMotors.setTargetVelocity(1);
	     //Wait for 1 second
	     Thread.sleep(1050);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	    
	   //Turn
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(1);
	   //Wait for 505milliseconds
	     Thread.sleep(710);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	    
	     leftMotors.setTargetVelocity(1);
	     rightMotors.setTargetVelocity(1);
	     //Wait for 1 second
	     Thread.sleep(1050);
	     
	   //Full stop
	     leftMotors.setTargetVelocity(0);
	     rightMotors.setTargetVelocity(0);
	   //Wait for 1 second
	     Thread.sleep(1000);
	    
	    
	    
	 }


}
