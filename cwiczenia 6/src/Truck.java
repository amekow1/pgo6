public class Truck extends Vehicle {
  private double milesDriven;
  private double fuelConsumed;
  private double cargoWeight;

  public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
    super(make, model, year);
    this.milesDriven = milesDriven;
    this.fuelConsumed = fuelConsumed;
    this.cargoWeight = cargoWeight;
  }
  @Override
  public double calculateFuelEfficiency() {
    double adjustFuelConsumed= fuelConsumed + (cargoWeight*0.5);
    if(adjustFuelConsumed==0){
      return 0;
    }
    return milesDriven/adjustFuelConsumed;
  }

}
