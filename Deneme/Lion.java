package Deneme;

import java.util.Scanner;


public class Lion implements Soundable, Glass {



    @Override
    public void makeSound() {
        System.out.println("Lion");
    }

    @Override
    public void takeOffGlass(int sayi) {

        System.out.println("Sayi alindi " + sayi);
    }
}

