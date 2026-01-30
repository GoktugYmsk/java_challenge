package JavaCornerStone.Encapsulation;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName, BankAccount account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    // Sadece Müşterinin adını döndüren getter
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Müşterinin hesabına erişim sağlayan getter
    public BankAccount getAccount() {
        return account;
    }
}