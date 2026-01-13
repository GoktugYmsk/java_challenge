package bank;

import java.util.Scanner;

public class DenemeMain {
    public static void main(String[] args) {

        DenemeAccount bank = new DenemeAccount(220000);
        Scanner veriAl = new Scanner(System.in);

        while (true) {
            System.out.println("Hoşgeldiniz");
            System.out.println("Hesap Bakiyesi için 1");
            System.out.println("Para yatırmak için 2");
            System.out.println("Para çekmek için 3");
            System.out.println("İşlemi iptal etmek için 4");
            int secim = veriAl.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Hesap bakiyeniz " + bank.hesapBakiyesiGetir());
                    bank.gktSign();
                    break;
                case 2:
                    System.out.println("Tutar giriniz ");
                    double moneyIn = veriAl.nextDouble();
                    bank.paraYatir(moneyIn);
                    bank.gktSign();
                    break;
                case 3:
                    System.out.println("Tutar giriniz ");
                    double moneyOut = veriAl.nextDouble();
                    bank.paraCek(moneyOut);
                    bank.gktSign();
                    break;
                case 4:
                    System.out.println("İşlem iptal edildi ");
                    veriAl.close();
                    bank.gktSign();
                    break;
            }

        }
    }
}
