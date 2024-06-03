

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Kia", "Sportage", 2024, 800, 50);
    System.out.println("Car make: " + car.getMake());
    System.out.println("Car model: " + car.getModel());
    System.out.println("Car year: " + car.getYear());
    System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");

    Truck truck=new Truck("Volvo","F16" , 2018, 1000, 100, 3);
    System.out.println("Truck make: " + truck.getMake());
    System.out.println("Truck model: " + truck.getModel());
    System.out.println("Truck year: " + truck.getYear());
    System.out.println("Truck fuel efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
  }
}




