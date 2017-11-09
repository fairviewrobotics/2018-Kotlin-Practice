package subsystem

import edu.wpi.first.wpilibj.command.Subsystem

//Constructs an immutable global drivetrain
val drivetrain = Drivetrain()

/**
 * Defines a drivetrain subsystem
 * Handles driving
 */
class Drivetrain: Subsystem() {

    /**
     * TODO figure out how this works
     */
    override fun initDefaultCommand() {
        TODO("not implemented")
    }

    /**
     * Takes in an x movement and a y movement and actually moves the drivetrain by that amount
     */
    fun drive(x: Double, y: Double) {
        TODO("should move drivetrain")
    }

}