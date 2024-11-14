public class Robot {
    int batteryLevel = 100;
    int speed = 0;
    int weight = 8;
    String name = "Robo";
    String color = "red";

    // Robot moving

    public void move(){
        speed = 5;
        System.out.println(name + " is moving at speed " + speed + "mph.");
    }

    // simulation of Robot stopping
    public void stop(){
        speed = 0;
        System.out.println(name + "    has   stopped.");
    }

      // Robot battery percentage

    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }

    // Check the battery level

    public void checkBattery(){
        System.out.println(name + "'s current battery level is " + batteryLevel + "%.");
    }


     // display the robot info

    public void displayInfo(){
        weight = 8;
        System.out.println(name + "'s color is : " + color + ".");
        System.out.println(name + "'s weight is : " + weight + "Kg.");
    }
}
