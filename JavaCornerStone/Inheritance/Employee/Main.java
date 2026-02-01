package JavaCornerStone.Inheritance.Employee;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner getData = new Scanner(System.in);

        // 1. Standart bir çalışan oluşturalım
        Employee emp = new Employee("Ahmet", 30000);

        System.out.println("--- Çalışan Bilgisi ---");
        System.out.println("İsim: " + emp.getName());
        System.out.println("Maaş: " + emp.getSalary() + " TL");

        System.out.println("\n-----------------------\n");

        // 2. Bir yönetici (Manager) oluşturalım
        // Manager'a hem maaş (Employee'den geliyor) hem de bonus veriyoruz

        Manager mgr = new Manager("Göktuğ", 50000, 15000);


        System.out.println("İsim: " + mgr.getName());
        System.out.println("--- Yönetici Bilgisi ---");

        // DİKKAT: Burada Manager'daki @Override edilmiş getSalary çalışacak!
        // Yani: super.getSalary() (50000) + bonus (15000) = 65000
        System.out.println("Toplam Gelir: " + mgr.getSalary() + " TL");

        System.out.println("/******************************/");



        System.out.println("Admin adını giriniz \n");
        String adminName = getData.nextLine();
        System.out.println("\n");

        System.out.println("Admin maaşını giriniz \n");
        double maxSalary = getData.nextDouble();
        System.out.println("\n");

        System.out.println("Admin bonusunu giriniz \n");
        double maxBonus = getData.nextDouble();
        System.out.println("\n");

        Admin adm = new Admin(adminName, maxSalary, maxBonus);

        System.out.println("Admin adı " + adm.getName());
        System.out.println("Admin maaşı =" + adm.getSalary());
    }
}