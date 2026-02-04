package JavaCornerStone.Polymorphism.HomeDevices;

// Light.java (Işık Bileşeni)
public class Light extends SmartDevice {
    public Light(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        if (isOn) System.out.println("-> Işık parlaklığı %100 yapıldı.");
    }
}

// Thermostat.java (Termostat Bileşeni)
class Thermostat extends SmartDevice {
    public Thermostat(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        if (isOn) System.out.println("-> Sıcaklık 22 dereceye sabitlendi.");
    }
}
