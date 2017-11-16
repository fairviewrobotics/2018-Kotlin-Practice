import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler

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
    }

    /**
     * A function that periodically gets called in the teleop period
     * Whatever goes in here defines what the robot periodically does
     */
    override fun teleopPeriodic() {
        Scheduler.getInstance().run()
    }

}