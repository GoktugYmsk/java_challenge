package Library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryService library = new LibraryService();

        library.listBooks();

        System.out.print("Ödünç almak istediğiniz kitap ID: ");
        int id = scanner.nextInt();

        if (library.borrowBook(id)) {
            System.out.println("Kitap başarıyla ödünç alındı!");
        } else {
            System.out.println("Kitap bulunamadı veya zaten ödünçte!");
        }

        System.out.println("\nGüncel liste:");
        library.listBooks();
        System.out.println("Göktuğ javayı öğreniyor.");
        scanner.close();
    }
}
