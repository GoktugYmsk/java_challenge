package JavaCornerStone.Encapsulation.Thermostat;

public class Main {
    public static void main(String[] args) {
        Thermostat livingRoom = new Thermostat(20.0);

        SmartHomeControl myHome = new SmartHomeControl("Göktuğ'un Evi", livingRoom);


        myHome.showStatus();
        myHome.increaseHeat();

        livingRoom.setTemp(55.0);

        myHome.showStatus();
    }
}