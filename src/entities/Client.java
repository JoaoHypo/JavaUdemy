package entities;

public class Client {

    private final int accountNumber;
    double balance;
    private String name;

    public Client (int accountNumber,String name,double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public Client (int accountNumber,String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double deposit){
        this.balance = BalanceSystem.deposit(balance,deposit);
    }

    public void withdraw(double withdraw){
        this.balance = BalanceSystem.withdraw(balance,withdraw);
    }

    public String toString(){
        return String.format("Account %d, ",accountNumber)+
               String.format("Holder %s, ",name)+
               String.format("Balance: $ %.2f",balance);
    }
    //private static final int accountNumber;
}
