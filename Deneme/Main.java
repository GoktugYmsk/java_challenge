package Deneme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");

        int sayi = scanner.nextInt();

        Glass deneme = new Lion();

        deneme.takeOffGlass(sayi);

        Soundable s1 = new Dog();
        Soundable s2 = new Cat();
        Soundable s3 = new Lion();


        s1.makeSound(); // Hav hav
        s2.makeSound(); // Miyav
        s3.makeSound();


    }
}
