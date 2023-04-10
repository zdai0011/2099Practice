public class SmartBulb {


    //private attributes
    private boolean status;
    private String colour;
    private double consumptionToday; // in watts
    //constructor
    public SmartBulb() {
    }

    //constructor overloading


    public SmartBulb(boolean status, String colour) {
        this.status = status;
        this.colour = colour;
    }

    // getters and setters
    public boolean isStatus() {
        return status;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getConsumptionToday() {
        return consumptionToday;
    }

    public void setConsumptionToday(double consumptionToday) {
        this.consumptionToday = consumptionToday;
    }
}
