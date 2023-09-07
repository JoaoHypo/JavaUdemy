package AccountSample;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
        loanLimit -= amount;
        balance += amount;
        }
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void withdraw(Double amount){
        double businessWithdrawBonusTax = 2.0;
        super.withdraw(amount);
        balance -= businessWithdrawBonusTax;
    }
}
