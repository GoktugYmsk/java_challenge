package JavaCornerStone.Encapsulation.Thermostat;

public class SmartHomeControl {
    private String homeName;
    private Thermostat livingRoomThermostat;

    public SmartHomeControl(String homeName, Thermostat thermostat) {
        this.homeName = homeName;
        this.livingRoomThermostat = thermostat;
    }

    public void increaseHeat() {
        double temp = livingRoomThermostat.getCurrentTemp();
        livingRoomThermostat.setTemp(temp + 1);
    }

    public void showStatus() {
        System.out.println(homeName + " Kontrol Paneli: " + livingRoomThermostat.toString());
    }
}