import org.jire.kton.kton

/**
 * A JSONesque collection of constants
 * Constants are inputted almost exactly like JSON, but there are a few key differences:
 *  1. Comments can be included
 *  2. To attach something to a key, instead of using the ":" from JSON, a "to" is used
 *  3. Lists and Hierarchies both use {} and immediately follow the identifier and don't need the "to" from 2
 *
 * TODO put documentation for how to access values stored in config
 */
val config = kton {
    "ports" {
        "joystick" to 0
        "wheels" {
            "frontLeft"  to 1
            "frontRight" to 2
            "backLeft"   to 3
            "backRight"  to 4
        }
    }
}