public class VehicleOne {

    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    public VehicleOne(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double calculateFuelEfficiency() {
        return 0;
    }

    public double calculateDistanceTraveled() {
        return 0;
    }

    public double getMaxSpeed(){
        return getMaxSpeed();

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
}
