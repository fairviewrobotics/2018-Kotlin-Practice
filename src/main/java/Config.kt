import org.jire.kton.kton

val config = kton {
    "ports" {
        "joystick" to 0

        "front" {
            "left" to 1
            "back" to 2
        }
        "back" {
            "left" to 3
            "back" to 4
        }
    }
}