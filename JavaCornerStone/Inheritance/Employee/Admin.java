package JavaCornerStone.Inheritance.Employee;

public class Admin extends Employee {

    private double maxBonus;

    public Admin(String name, double maxSalary, double maxBonus){
        super(name,maxSalary);
        this.maxBonus = maxBonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + maxBonus;
    }
}
