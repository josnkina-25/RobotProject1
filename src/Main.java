public class Main {
    public static void main(String[] args) {

        Robot myRobot = new Robot();
        myRobot.move();
        myRobot.checkBattery();
        myRobot.stop();
        myRobot.chargeBattery();
        myRobot.displayInfo();
    }
}