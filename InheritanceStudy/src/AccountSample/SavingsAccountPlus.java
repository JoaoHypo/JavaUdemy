package AccountSample;

public class SavingsAccountPlus extends SavingsAccount{
    //extends SavingsAccount blocked if SavingsAccount is Final
//    @Override
//    public void withdraw(Double amount){
//        balance -= amount;
//    } error since withdraw is final in SavingsAccount

    //final = faster, less evaluation
}
