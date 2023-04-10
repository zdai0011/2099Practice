public class SmartHomeDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to the Smart Home System");

        SmartBulb bulb1 = new SmartBulb();
        bulb1.turnOn();
        bulb1.setColour("red");

        SmartBulb bulb2 = new SmartBulb(false,"yellow");

    }
}
