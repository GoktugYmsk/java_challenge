package JavaCornerStone.Polymorphism.HomeDevices;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        HomeHub myHome = new HomeHub();

        //myHome.addDevice(new Light("Salon Lambası"));
        //myHome.addDevice(new Thermostat("Termostat"));
        //myHome.addDevice(new Light("Mutfak Lambası"));

        Television masterTV = new Television("Tüm Ev TV Sistemi");

        masterTV.addSubTV(new LivingRoomTV("Salon TV"));
        masterTV.addSubTV(new KitchenTV("Mutfak TV"));
        masterTV.addSubTV(new BedroomTV("Yatak Odası TV"));
        masterTV.addSubTV(new KidsRoomTV("Çocuk Odası TV"));

        myHome.addDevice(masterTV);


        myHome.activateAll();

        // Zamanlayıcı
        ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();

        timer.schedule(() -> {
            System.out.println("\n--- Sistem 5 saniye sonra kapatılacak... ---\n");
        }, 2, TimeUnit.SECONDS);

        timer.schedule(() -> {
            myHome.closeAll();
            timer.shutdown();
        }, 5, TimeUnit.SECONDS);
    }
}