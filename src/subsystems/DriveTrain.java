package subsystems;

import com.ctre.CANTalon.TalonControlMode;

import Util.DriveHelper;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.Robot;
import main.commands.DriveCommand;

public class DriveTrain extends Subsystem implements Constants, HardwareAdapter {
	private static RobotDrive driveTrain = new RobotDrive(leftDriveMaster, rightDriveMaster);
	private DriveHelper helper = new DriveHelper(7.5);

	public DriveTrain() {
		setTalonDefaults();
	}

	public void driveVelocity(double throttle, double heading) {
		setBrakeMode(true);
		driveTrain.arcadeDrive(helper.handleOverPower(throttle), helper.handleOverPower(heading));
		//move value, rotate value
	}

	/**
	 * Reverses the output of the Talon SRX's
	 * 
	 * @param output
	 *            - Whether the output should be reversed.
	 */
	private void reverseTalons(boolean output) {// Actually Works ?
		leftDriveMaster.reverseOutput(output);
		rightDriveMaster.reverseOutput(output);
	}

	/**
	 * Sets the Talon SRX's brake mode
	 * 
	 * @param brake
	 *            - Sets the brake mode (Uses default brake modes)
	 */
	private void setBrakeMode(Boolean brake) {
		leftDriveMaster.enableBrakeMode(brake);
		leftDriveSlave1.enableBrakeMode(brake);
		
		rightDriveMaster.enableBrakeMode(brake);
		rightDriveSlave1.enableBrakeMode(brake);
	}

	/**
	 * Sets the Talon SRX's control mode
	 * 
	 * @param mode
	 *            - Sets the control mode (Uses default control modes)
	 */
	private void setCtrlMode(TalonControlMode mode) {
		leftDriveMaster.changeControlMode(mode);
		leftDriveSlave1.changeControlMode(SLAVE_MODE);
		leftDriveSlave1.set(leftDriveMaster.getDeviceID());

		rightDriveMaster.changeControlMode(mode);
		rightDriveSlave1.changeControlMode(SLAVE_MODE);
		rightDriveSlave1.set(rightDriveMaster.getDeviceID());
	}

	/**
	 * Sets the Talon SRX's defaults (reversing, brake and control modes)
	 */
	private void setTalonDefaults() {
		reverseTalons(true);// Changing this didn't do anything, mathematically
							// negated in drive command
		setBrakeMode(true);
		setCtrlMode(DEFAULT_CTRL_MODE);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());

	}

}


