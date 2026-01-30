package JavaCornerStone.Encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount(1000);
        Customer customer = new Customer("Ahmet", "Yılmaz", myAcc);


        System.out.println("Müşteri: " + customer.getFullName());
        System.out.println("Deneme " + customer.getAccount().getBalance());

        customer.getAccount().deposit(500);  // 1500 oldu
        customer.getAccount().withdraw(2000); // Hata vermeli

        System.out.println("Son Bakiye: " + customer.getAccount().getBalance() + " TL");
    }
}
