package JavaCornerStone.Abstraction;


public abstract class KahveMakinesi {
    private String kahveAdi;

    public KahveMakinesi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }


    public abstract void malzemeEkle();


    public void suIsit() {
        System.out.println(kahveAdi + " için su 90 dereceye getiriliyor...");
    }

    public void bardagaDök() {
        System.out.println(kahveAdi + " bardağa dolduruluyor. Afiyet olsun!\n");
    }


    public final void kahveHazirla() {
        System.out.println("--- " + kahveAdi + " Hazırlanıyor ---");
        suIsit();
        malzemeEkle();
        bardagaDök();
    }
}

class Espresso extends KahveMakinesi {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public void malzemeEkle() {
        System.out.println("-> İnce öğütülmüş yoğun kahve ekleniyor.");
    }
}

class Latte extends KahveMakinesi {
    public Latte() { super("Latte"); }

    @Override
    public void malzemeEkle() {
        System.out.println("-> Espresso üzerine süt köpüğü ekleniyor.");
    }
}