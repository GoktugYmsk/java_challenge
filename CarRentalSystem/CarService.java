package CarRentalSystem;

import java.util.ArrayList;

public class CarService {

    private ArrayList<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car(1, "BMW", 1500));
        cars.add(new Car(2, "Audi", 1400));
        cars.add(new Car(3, "Toyota", 900));
    }

    public void listCars() {
        for (Car car : cars) {
            System.out.println(
                    car.getId() + " - " +
                            car.getModel() +
                            " | Günlük: " + car.getPricePerDay() +
                            " | Durum: " + (car.isAvailable() ? "Uygun" : "Kirada"));
        }
    }

    public Car getCarById(int id) {
        for (Car car : cars) {
            if (car.getId() == id && car.isAvailable()) {
                return car;
            }
        }
        return null;
    }
}
