public class Main {
    public static void main(String[] args) {

        Robot myRobot = new Robot();
        myRobot.move(); // make the robot move
        myRobot.checkBattery(); // checking the robot battery.
        myRobot.stop(); // stopping the robot.
        myRobot.chargeBattery(); // checking the battery level of the robot.
        myRobot.displayInfo(); // displays the robot info (color and weight)
    }
}