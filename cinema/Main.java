package cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SİNEMA BİLET SİSTEMİ ---");
            System.out.println("1 - Bilet Satın Al");
            System.out.println("2 - Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Film adı (1: Dune, 2: Interstellar): ");
                    int filmChoice = scanner.nextInt();

                    if (filmChoice != 1 && filmChoice != 2) {
                        System.out.println("Geçersiz film seçimi!");
                        break;
                    }

                    System.out.print("Bilet adedi: ");
                    int ticketCount = scanner.nextInt();

                    if (ticketCount <= 0 || ticketCount > 10) {
                        System.out.println("Geçersiz bilet adedi!");
                        System.out.println("Tek seferde en fazla 10 bilet satın alabilirsiniz.");
                        break;
                    }

                    System.out.print("Öğrenci misiniz? (1: Evet, 0: Hayır): ");
                    int studentChoice = scanner.nextInt();

                    double pricePerTicket;
                    if (studentChoice == 1) {
                        pricePerTicket = 80;
                    } else {
                        pricePerTicket = 120;
                    }

                    double totalPrice = ticketCount * pricePerTicket;

                    System.out.println("Toplam tutar: " + totalPrice + " TL");
                    break;

                case 2:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
