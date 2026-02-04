package JavaCornerStone.Polymorphism.HomeDevices;

import java.util.ArrayList;
import java.util.List;

public class Television extends SmartDevice {
    private List<Television> subTVs = new ArrayList<>();

    public Television(String name) {
        super(name);
    }

    public void addSubTV(Television tv) {
        subTVs.add(tv);
    }

    @Override
    public void performAction() {
        if (isOn) {

            if (!subTVs.isEmpty()) {
                System.out.println(">>> TV Sistemi Grubu Çalışıyor <<<");
                for (Television tv : subTVs) {
                    tv.isOn = true;
                    tv.performAction();
                }
            } else {

                System.out.println(getName() + " üzerinden yayın başladı.");
            }
        }
    }


}

class LivingRoomTV extends Television {
    public LivingRoomTV(String name) { super(name); }

    @Override
    public void performAction() {
        if(isOn) System.out.println("-> Salon TV: Spotify üzerinden 'Daily Mix' çalınıyor.");
    }
}

class KitchenTV extends Television {
    public KitchenTV(String name) { super(name); }
    @Override
    public void performAction() {
        if(isOn) System.out.println("-> Mutfak TV: Yemek tarifi videosu başlatıldı.");
    }
}

class BedroomTV extends Television {
    public BedroomTV(String name) { super(name); }
    @Override
    public void performAction() {
        if(isOn) System.out.println("-> Yatak Odası TV: Uyku öncesi belgesel açıldı.");
    }
}

class KidsRoomTV extends Television {
    public KidsRoomTV(String name) { super(name); }
    @Override
    public void performAction() {
        if(isOn) System.out.println("-> Çocuk Odası TV: Çizgi film yayını başladı.");
    }
}