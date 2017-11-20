package main;

public interface Constants {
	/****************
	 ****variables***
	 * for the thing*
	 ****************
	 */
	//copying? What copying, Alex?
	public final int Xbox_Port=0;
	public final int LEFT_Drive_Master = 2;
	public final int LEFT_Drive_Slave1 = 3;
	public final int RIGHT_Drive_Master = 5;
	public final int RIGHT_Drive_Slave1 = 6;
	// DEFAULT TALON MODES
	public final TalonControlMode DEFAULT_CTRL_MODE = TalonControlMode.PercentVbus;
	public final boolean DEFAULT_BRAKE_MODE = true;
	// TALON CONTROL MODES
	public final TalonControlMode VELOCITY = TalonControlMode.Speed;
	public final TalonControlMode PERCENT_VBUS_MODE = TalonControlMode.PercentVbus;
	public final TalonControlMode POSITION = TalonControlMode.Position;
	public final TalonControlMode VOLTAGE_MODE = TalonControlMode.Voltage;
	public final TalonControlMode SLAVE_MODE = TalonControlMode.Follower;
	public final TalonControlMode DISABLED = TalonControlMode.Disabled;
	// TALON BRAKE MODES
	public final boolean BRAKE_MODE = true;
	public final boolean COAST_MODE = false;
}
