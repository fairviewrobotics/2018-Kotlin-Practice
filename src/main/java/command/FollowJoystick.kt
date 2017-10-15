package command

import config
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.command.Command
import subsystem.drivetrain

/**
 * A Command that connects the joystick to the drivetrain
 */
class FollowJoystick: Command() {

    private val joystick: Joystick = Joystick(config("ports")["joystick"] as Int)

    init {
        requires(drivetrain)
    }

    /**
     * Moves the drive train based on joystick's x and y coordinates
     */
    override fun execute() {
        drivetrain.drive(joystick.x, joystick.y)
    }

    override fun isFinished(): Boolean {
        TODO("not implemented")
    }

}