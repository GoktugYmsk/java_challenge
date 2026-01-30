package JavaCornerStone.Encapsulation;

public class BankAccount {
    private double balance;

    protected String name = "Göktuğ";

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "İsmi" + name;
    }



    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatırıldı.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " TL çekildi.");
        } else {
            System.out.println("Hata: Yetersiz bakiye veya geçersiz tutar!");
        }
    }
}