package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner gktScanner = new Scanner(System.in);
        Account account = new Account(1000);

        while (true) {
            System.out.println("\n--- BANKA MENÜSÜ ---");
            System.out.println("1 - Para Yatır");
            System.out.println("2 - Para Çek");
            System.out.println("3 - Bakiye Görüntüle");
            System.out.println("4 - Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = gktScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Yatırılacak tutar: ");
                    double depositAmount = gktScanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Çekilecek tutar: ");
                    double withdrawAmount = gktScanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Mevcut bakiye: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    gktScanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
