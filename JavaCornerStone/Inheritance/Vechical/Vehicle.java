package JavaCornerStone.Inheritance.Vechical;

class Vehicle {
    protected String brand;

    public void start() {
        System.out.println("Araç çalışıyor...");
    }

    public void writeMessage() {
        System.out.println("Uyarı mesajı");
    }

    public void openTrunk() {
        System.out.println("OpenTrunk fonksiyonu çalışıyor");
        writeMessage();
        System.out.println(brand + " bagajı açıldı.");
    }
}

