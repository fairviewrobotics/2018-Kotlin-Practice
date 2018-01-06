# Steps to Deploy Using GradleRIO
1. Ensure at some point the machine had built the code with the command `gradle build`.
2. Connect to robot wireless network (SSID should be `2036`)
3. Run the command `gradle deploy`, or, if at competition or under conditions where internet is unavailable, run `gradle build deploy --offline`
4. Ensure in DriverStation that there are communications with the robot, the robot has the code, and the joystick inputs are being received. Restart RoboRIO or robot code if necessary.