package frc.team2036.robot.subsystem

import edu.wpi.first.wpilibj.RobotDrive
import edu.wpi.first.wpilibj.Talon
import edu.wpi.first.wpilibj.command.Subsystem
import frc.team2036.robot.command.followJoystick
import frc.team2036.robot.config


//Constructs an immutable global drivetrain
val drivetrain = Drivetrain()

/**
 * Defines a drivetrain subsystem
 * Represents a RobotDrive that handles driving
 * This particular implementation uses arcadeDrive as opposed to mecanumDrive_Cartesian, mecanumDrive_Polar, or tankDrive
 */
class Drivetrain : Subsystem() {

    //The robot drive is the actual part of the code that controls robot movement; is constructed with Talons
    private val robotDrive = RobotDrive(
            Talon(config("ports")("wheels")["frontLeft"] as Int),
            Talon(config("ports")("wheels")["backLeft"] as Int),
            Talon(config("ports")("wheels")["frontRight"] as Int),
            Talon(config("ports")("wheels")["backRight"] as Int))

    /**
     * Sets the default command as a followJoystick command
     */
    override fun initDefaultCommand() {
        this.defaultCommand = followJoystick
    }

    /**
     * Takes in an x movement and a y movement and actually moves the drivetrain by that amount
     */
    fun drive(x: Double, y: Double) {
        val scaledX = x * config["motorScale"] as Double
        val scaledY = y * config["motorScale"] as Double
        this.robotDrive.arcadeDrive(scaledX, scaledY)
    }

}
