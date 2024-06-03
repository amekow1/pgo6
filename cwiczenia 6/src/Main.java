import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    vehicles.add(new Car("Kia", "Sportage", 2024, 580, 30));
    vehicles.add(new Truck("Volvo", "F-150", 2017, 240, 60, 2));

    for (Vehicle vehicle : vehicles) {
      System.out.println("Marka: " + vehicle.getMake());
      System.out.println("Model: " + vehicle.getModel());
      System.out.println("Rok produkcji: " + vehicle.getYear());
      System.out.println("Efektywność paliwowa: " + vehicle.calculateFuelEfficiency());
      System.out.println();
    }
  }
}




