package JavaCornerStone.Abstraction;

public class Main {
    public static void main(String[] args) {


        KahveMakinesi siparis1 = new Espresso();
        KahveMakinesi siparis2 = new Latte();


        siparis1.kahveHazirla();
        siparis2.kahveHazirla();
    }
}
