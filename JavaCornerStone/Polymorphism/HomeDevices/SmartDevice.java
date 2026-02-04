package JavaCornerStone.Polymorphism.HomeDevices;

public abstract class SmartDevice {
    private String name;
    protected boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = true;
    }


    public abstract void performAction();

    public void turnOn() {
        isOn = true;
        System.out.println(name + " açıldı.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " kapandı.");
    }

    public String getName() { return name; }
}