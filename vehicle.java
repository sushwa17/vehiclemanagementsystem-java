// Vehicle.java
import java.util.Objects;

/**
 * Abstract base class representing a generic vehicle.
 */
public abstract class Vehicle {
    private final String brand;
    private final String model;

    public Vehicle(String brand, String model) {
        this.brand = Objects.requireNonNull(brand, "brand must not be null");
        this.model = Objects.requireNonNull(model, "model must not be null");
    }

    /**
     * Display basic vehicle information.
     */
    public void displayInfo() {
        System.out.println("--- Vehicle Information ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    /**
     * Start the vehicle's engine. Must be implemented by subclasses.
     */
    public abstract void startEngine();

    /**
     * Stop the vehicle's engine.
     */
    public void stopEngine() {
        System.out.println(brand + " " + model + " engine stopped.");
    }

    /* Protected getters for subclasses */
    protected String getBrand() {
        return brand;
    }

    protected String getModel() {
        return model;
    }
}
