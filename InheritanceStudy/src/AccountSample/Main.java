package AccountSample;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1212,"Hypolol",0.0);
        BusinessAccount bacc = new BusinessAccount(1213,"Bu",0.0,500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1214,"Geraldin",0.0,600.0);
        Account acc3 = new SavingsAccount(1214,"Lu",0.0,0.02);

        // acc2.loan(); subclass specific attributes and own methods are still on the instance but we can't access

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2; // needed cast to get the hidden attributes
        System.out.println(acc4.getLoanLimit());

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3; //breaks,
            System.out.println("Loan");
            System.out.println(acc5.getLoanLimit());
            }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc6 = (SavingsAccount) acc3;
            System.out.println("Interest Rate");
            System.out.println(acc6.getInterestRate());
        }
        else {
            System.out.println("Not an instance");
        }

        Account test = new Account(1212,"Test",100.0);
        test.withdraw(10.0);
        System.out.printf("Mother Class Method - tax = 5: %.2f%n",test.getBalance());

        SavingsAccount test2 = new SavingsAccount(1212,"Test",100.0,0.01);
        test2.withdraw(10.0);
        System.out.printf("SavingAccount Class Method - tax = 0: %.2f%n",test2.getBalance());

        BusinessAccount test3 = new BusinessAccount(1212,"Test",100.0,100.0);
        test3.withdraw(10.0);
        System.out.printf("BusinessAccount Class Method - tax = Mother tax + 2: %.2f%n",test3.getBalance());


        Account poli = new Account(1212,"Test",100.0);
        poli.withdraw(10.0);
        System.out.printf("Account - instance: Account - tax = 5: %.2f%n",poli.getBalance());

        Account poli2 = new SavingsAccount(1212,"Test",100.0,0.01);
        poli2.withdraw(10.0);
        System.out.printf("Account - instance: SavingsAccount - tax = 0: %.2f%n",poli2.getBalance());

        System.out.println(((BusinessAccount) acc2).getLoanLimit());
    }
}
