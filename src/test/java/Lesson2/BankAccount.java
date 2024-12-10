package Lesson2;

public class BankAccount {
    int id ;
    String name ;
    double balance ;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.id = 1;
        account.name = "John Doe";
        account.balance = 1000.0;
        System.out.println(account.id);
        BankAccount yourAccount = new BankAccount();
        yourAccount.id = 2;
        yourAccount.name = "Jane Doe2";
        yourAccount.balance = 500.0;
        System.out.println(yourAccount.id);
    }
}
