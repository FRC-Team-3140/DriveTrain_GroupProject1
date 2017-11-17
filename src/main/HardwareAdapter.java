package main;

import com.ctre.CANTalon;

import lib.joystick.XboxController;

public interface HardwareAdapter extends Constants {
	//OI
	public static XboxController xbox = new XboxController(Xbox_Port);
	
	//DriveTrain
	public static CANTalon leftDriveMaster = new CANTalon(LEFT_Drive_Master);
	public static CANTalon leftDriveSlave1 = new CANTalon(LEFT_Drive_Slave1);
	public static CANTalon rightDriveMaster = new CANTalon(RIGHT_Drive_Master);
	public static CANTalon rightDriveSlave1 = new CANTalon(RIGHT_Drive_Slave1);
}
