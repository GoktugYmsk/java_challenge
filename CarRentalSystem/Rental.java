package CarRentalSystem;

public class Rental {
    private Customer customer;
    private Car car;
    private int days;

    public Rental(Customer customer, Car car, int days) {
        this.customer = customer;
        this.car = car;
        this.days = days;
    }

    public double calculateTotalPrice() {
        return days * car.getPricePerDay();
    }

    public void showRentalInfo() {
        System.out.println(customer.getName() + " → " + car.getModel() +
                " | Gün: " + days +
                " | Toplam: " + calculateTotalPrice() + " TL");
    }
}
