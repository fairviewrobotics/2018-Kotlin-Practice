package command

import config
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.command.Command
import subsystem.drivetrain

/**
 * A Command that connects the joystick to the drivetrain
 * Just sends all joystick inputs to the robot
 */
class FollowJoystick: Command() {

    //The joystick port obtained from the config file
    private val joystick: Joystick = Joystick(config("ports")["joystick"] as Int)

    /**
     * Constructor for a FollowJoystick command
     * Just states that this command needs the drivetrain
     */
    init {
        requires(drivetrain)
    }

    /**
     * Moves the drive train based on joystick's x and y coordinates
     * Just takes in the joystick axes and passes them to the drivetrain to handle driving
     */
    override fun execute() {
        drivetrain.drive(joystick.x, joystick.y)
    }

    /**
     * TODO figure out how this works
     */
    override fun isFinished(): Boolean {
        TODO("not implemented")
    }

}