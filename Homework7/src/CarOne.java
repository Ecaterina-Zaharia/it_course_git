public class CarOne extends VehicleOne {

    private int numSeats;

    public CarOne(String make, String model, int year, String fuelType, double fuelEfficiency,
                  int numSeats){
        super(make, model, year, fuelType, fuelEfficiency);
    }

    @Override
    public double calculateFuelEfficiency(){
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    @Override
    public double calculateDistanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed(){
        return 120.0;
    }

    public int getNumSeats() {
        return numSeats;
    }

}
