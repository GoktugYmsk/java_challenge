package JavaCornerStone.Inheritance.Employee;

// Alt Sınıf
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }


    private void getWriteExample(){
        System.out.println("Yöneticinin maaş bilgileirini override ile ezip değiştiriyoruz");
    }

    // Yönetici maaşı güncellendi
    @Override
    public double getSalary() {
        getWriteExample();
        return super.getSalary() + bonus;
    }
}
