import java.util.ArrayList;

public abstract class Vehicle {
  private String make;
  private String model;
  private int year;


  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }



  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }
  public abstract double calculateFuelEfficiency();

}
