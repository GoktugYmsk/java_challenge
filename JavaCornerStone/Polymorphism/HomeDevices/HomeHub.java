package JavaCornerStone.Polymorphism.HomeDevices;


import java.util.ArrayList;
import java.util.List;

public class HomeHub {

    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice gkt) {
        devices.add(gkt);
    }

    public void activateAll() {
        System.out.println("=== Akıllı Ev Modu Devreye Giriyor ===");
        for (SmartDevice device : devices) {
            device.turnOn();       //
            device.performAction(); //
        }
    }

    public void closeAll(){
        System.out.println("Tüm cihazlar kapatılıyor");
        for(SmartDevice device : devices){
            device.turnOff();
        }
    }
}

