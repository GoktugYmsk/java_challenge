package CarRentalSystem;

public class Car {
    private int id;
    private String model;
    private double pricePerDay;
    private boolean available;

    public Car(int id, String model, double pricePerDay) {
        this.id = id;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentCar() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }
}
