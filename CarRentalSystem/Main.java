package CarRentalSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CarService carService = new CarService();

        while (true) {
            System.out.println("\n--- ARAÇ KİRALAMA SİSTEMİ ---");
            System.out.println("1 - Araçları Listele");
            System.out.println("2 - Araç Kirala");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    carService.listCars();
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Adınız: ");
                    String name = scanner.nextLine();

                    System.out.print("Araç ID: ");
                    int carId = scanner.nextInt();

                    System.out.print("Kaç gün: ");
                    int days = scanner.nextInt();

                    Car selectedCar = carService.getCarById(carId);

                    if (selectedCar == null) {
                        System.out.println("Araç uygun değil!");
                        break;
                    }

                    Customer customer = new Customer(name);
                    Rental rental = new Rental(customer, selectedCar, days);

                    selectedCar.rentCar();
                    rental.showRentalInfo();
                    break;

                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
