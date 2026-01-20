package Personal;

public class Main {

    public static void main(String[] args) {

        /*
         * Object oluşturma
         * Referans tipi: Employee
         * Gerçek nesne: Developer / Manager
         */
        Employee emp1 = new Developer("Ahmet", 40000, "Java");
        Employee emp2 = new Manager("Ayşe", 60000, 5);

        // Polymorphism
        emp1.work(); // Developer çalışır
        emp2.work(); // Manager çalışır

        // Interface üzerinden çağırım
        System.out.println("Ahmet maaş: " + emp1.calculateSalary());
        System.out.println("Ayşe maaş: " + emp2.calculateSalary());
    }
}
