package subsystem

import edu.wpi.first.wpilibj.command.Subsystem

val drivetrain = Drivetrain()

class Drivetrain: Subsystem() {

    override fun initDefaultCommand() {
        TODO("not implemented")
    }

    fun drive(x: Double, y: Double) {
        TODO("should move drivetrain")
    }

}