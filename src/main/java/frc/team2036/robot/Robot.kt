package frc.team2036.robot
import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import frc.team2036.robot.subsystem.drivetrain

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
        drivetrain
    }

    override fun teleopInit() {

    }

    override fun teleopPeriodic() {
        Scheduler.getInstance().run()
    }

}