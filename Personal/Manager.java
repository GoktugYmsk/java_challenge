package Personal;
/*
 * Manager da bir Employee'dir
 */
public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " ekibi yönetiyor (" + teamSize + " kişi)");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (teamSize * 1000);
    }
}
