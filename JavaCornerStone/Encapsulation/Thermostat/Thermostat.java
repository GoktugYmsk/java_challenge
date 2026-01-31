package JavaCornerStone.Encapsulation.Thermostat;

public class Thermostat {
    private double currentTemp;

    public Thermostat(double initialTemp) {
        this.currentTemp = initialTemp;
    }


    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setTemp(double newTemp) {
        if (newTemp >= 5.0 && newTemp <= 40.0) {
            this.currentTemp = newTemp;
            System.out.println("Sıcaklık " + newTemp + " dereceye ayarlandı.");
        } else {
            System.out.println("Hata: Güvenlik nedeniyle bu sıcaklığa ayarlanamaz!");
        }
    }


    @Override
    public String toString() {
        return "Termostat Durumu: " + currentTemp + "°C";
    }
}