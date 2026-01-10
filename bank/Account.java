package bank;

public class Account {
    private double balance;

    public Account(double gktInitialBalance) {
        this.balance = gktInitialBalance;
    }

    public void deposit(double miktar) {
        if (miktar > 0) {
            balance += miktar;
            System.out.println("Para yatırıldı. Yeni bakiye: " + balance);
        } else {
            System.out.println("Geçersiz tutar!");
        }
    }

    public void withdraw(double miktar) {
        if (miktar > 0 && miktar <= balance) {
            balance -= miktar;
            System.out.println("Para çekildi. Yeni bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz tutar!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
