// VehicleManager.java

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {

    public static void main(String[] args) {
        // 1. Create a list of the Parent type (Vehicle)
        List<Vehicle> vehicles = new ArrayList<>();

        // 2. Store Child objects in the Parent list.
        // This is the core of Polymorphism (A Vehicle variable can reference a Car object)
        vehicles.add(new Car("Toyota", "Camry", 4));
        vehicles.add(new Car("Honda", "Civic", 2));
        // We'll just use Car for simplicity, but you could add Motorcycle, Truck, etc.

        System.out.println("--- 🌍 Vehicle Management System Demo ---");

        // 3. Iterate over the list and call methods
        // The JVM decides which specific startEngine() method to call at runtime
        // based on the actual object type (Car's startEngine or Motorcycle's startEngine)
        // This is called Dynamic Method Dispatch (Run-time Polymorphism)
        for (Vehicle v : vehicles) {
            v.displayInfo();  // Overridden method
            v.startEngine();  // Abstract/Polymorphic method
            v.stopEngine();   // Inherited common method
            System.out.println("---------------------------------");
        }

        // 4. Accessing a child-specific method (requires casting)
        // You cannot call openTrunk() directly on a Vehicle object.
        Car myCar = (Car) vehicles.get(0);
        myCar.openTrunk();
    }
}
