package Personal;

/*
 * Developer bir Employee'dir (is-a ilişkisi)
 */
public class Developer extends Employee {

    private String language;

    public Developer(String name, double baseSalary, String language) {
        super(name, baseSalary); // parent constructor
        this.language = language;
    }

    // Method override
    @Override
    public void work() {
        System.out.println(name + " " + language + " ile kod yazıyor");
    }

    // Maaş hesaplama override
    @Override
    public double calculateSalary() {
        return baseSalary + 5000; // Developer bonus
    }
}
