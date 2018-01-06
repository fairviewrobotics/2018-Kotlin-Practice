package frc.team2036.robot.subsystem

import frc.team2036.robot.config
import frc.team2036.robot.command.followJoystick
import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.RobotDrive
import edu.wpi.first.wpilibj.Talon


//Constructs an immutable global drivetrain
val drivetrain = Drivetrain()

/**
 * Defines a drivetrain subsystem
 * Represents a RobotDrive that handles driving
 * This particular implementation uses arcadeDrive as opposed to mecanumDrive_Cartesian, mecanumDrive_Polar, or tankDrive
 */
class Drivetrain: Subsystem() {

    //The robot drive is the actual part of the code that controls robot movement; is constructed with Talons
    val robotDrive = RobotDrive(
            Talon(config("ports")("wheels")["frontLeft"] as Int),
            Talon(config("ports")("wheels")["backLeft"] as Int),
            Talon(config("ports")("wheels")["frontRight"] as Int),
            Talon(config("ports")("wheels")["backRight"] as Int))

    /**
     * Sets the default command as a followJoystick command
     */
    override fun initDefaultCommand() {
        println("Yay!")
        this.defaultCommand = followJoystick
    }

    /**
     * Takes in an x movement and a y movement and actually moves the drivetrain by that amount
     */
    fun drive(x: Double, y: Double) {
        //Is (y, x) because y is how much forward or backward it goes, and x is how much to the side it goes
        this.robotDrive.arcadeDrive(y, x)
    }

}