public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        // Calls the constructor of the parent class (Vehicle)
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    // Implementing the abstract method from Vehicle (Polymorphism)
    @Override
    public void startEngine() {
        System.out.println("*Car Engine Started:* The " + brand + " " + model + " key is turned.");
    }

    // Car-specific method
    public void openTrunk() {
        System.out.println(brand + " " + model + " trunk is open.");
    }

    // Overriding the common method to add more details (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's method first
        System.out.println("Doors: " + numberOfDoors);
    }
}
