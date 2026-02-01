package JavaCornerStone.Inheritance.Vechical;

public class Main {
    public static void main(String[] args) {


        Car myCar = new Car("Tesla", 4);

        myCar.start();

        myCar.openTrunk();

        Car mysteryVehicle = new Car("BMW", 2);

        // Vehicle deneme = new Vehicle();
        // deneme.writeMessage();

        mysteryVehicle.start();

        System.out.println("Kontrol kodu");
        mysteryVehicle.openTrunk();
    }
}