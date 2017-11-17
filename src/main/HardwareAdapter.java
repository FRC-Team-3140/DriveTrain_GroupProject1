package main;

import lib.joystick.AdvJoystick;
import lib.joystick.XboxController;

public interface HardwareAdapter extends Constants {
	//oi
	public static XboxController xbox = new XboxController(Xbox_Port);
		
	//DriveTrain
	public static CANTalon leftDriveMaster = new CANTalon(LEFT_Drive_Master);
	public static CANTalon leftDriveSlave1 = new CANTalon(LEFT_Drive_Slave1);
	
	public static CANTalon rightDriveMaster = new CANTalon(RIGHT_Drive_Master);
	public static CANTalon rightDriveSlave1 = new CANTalon(RIGHT_Drive_Master);
}
