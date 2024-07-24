package entities;

public class Account {

    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.holder = name;
    }

    public Account(int number, String holder , double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber(){
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName(){
        return this.holder;
    }

    public void setName(String name) {
        this.holder = name;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        return "Account" + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
