package ContractExercise.services;

public class PaypalService implements OnlinePaymentService{
    @Override
    public double paymentFee(double amount) {
        //2% fee/tax
        return amount*1.02;
    }

    @Override
    public double interest(double amount, int months) {
        //1% interest
        return amount * (((double) months/100.0 ) + 1) ;
    }
}
