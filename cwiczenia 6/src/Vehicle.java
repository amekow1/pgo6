import java.util.ArrayList;

public abstract class Vehicle {
  private String make;
  private String model;
  private ArrayList<Vehicle> vehicles=new ArrayList<>();

  public void addVehicle(Vehicle v){
    vehicles.add(v);
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

  public int year;

  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }
  public abstract double calculateFuelEfficiency();

}
