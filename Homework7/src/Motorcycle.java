public class Motorcycle extends VehicleOne {

    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency){
        super(make, model, year, fuelType, fuelEfficiency);
    }

    @Override
    public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed(){
        return 80.0;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }
}
