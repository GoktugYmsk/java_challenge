package JavaCornerStone.Inheritance.Vechical;

// Alt Sınıf (Child)
class Car extends Vehicle {
    private int doorCount;

    public Car(String brand, int doorCount) {
        this.brand = brand;
        this.doorCount = doorCount;
    }

    public void openTrunk() {

        super.openTrunk();
        /// super metodunu kullanmazsak, java parent componentteki ayni fonksiyonu görmezden
        /// gelip childdaki fonksiyonu calistirir.

    }
}
