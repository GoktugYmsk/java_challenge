package Personal;

/*
 * Base (Parent) class
 * Ortak özellikleri ve davranışları tutar
 */
public class Employee implements Payable {

    // protected → child class erişebilir
    protected String name;
    protected double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Ortak davranış
    public void work() {
        System.out.println(name + " çalışıyor");
    }

    // Interface metodunun temel implementasyonu
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
