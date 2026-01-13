package bank;

public class DenemeAccount {
    private double bakiye;

    public DenemeAccount(double kesan) {
        this.bakiye = kesan;
    }

    public double hesapBakiyesiGetir() {
        return bakiye;
    }

    public void paraYatir(double tl) {
        if (tl > 0) {

            bakiye += tl;
            System.out.println("Para yatırıldı. Yeni bakiye: " + bakiye);

        } else {
            System.out.println("Geçersiz tutar!");
        }
    }

    public void paraCek(double tl) {
        if (tl > 0 && tl <= bakiye) {
            bakiye -= tl;
            System.out.println(tl + " Tl para çekildi. Yeni bakiye " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye. Şuanki bakiye " + bakiye);
        }
    }

    public void gktSign() {
        System.out.println("**************** GKT BANK *****************");
    }
}
