package frc.team2036.robot
import edu.wpi.first.wpilibj.IterativeRobot
import frc.team2036.robot.subsystem.drivetrain
import frc.team2036.robot.command.followJoystick

/**
 * Entry point for custom code
 * Defines the main robot class that will be run by the RIO
 * Is an iterative robot so that it can define a set of functions that periodically gets executed
 */
class Robot: IterativeRobot() {

    /**
     * The entry point for a robot
     * Entry code doesn't go in a constructor, goes here
     */
    override fun robotInit() {
        super.robotInit()
        println("YAY!!!!!!")
        println(drivetrain)
    }

    override fun teleopPeriodic() {
        println("TELEOP!")
        drivetrain.drive(1.0,0.0)
    }

}