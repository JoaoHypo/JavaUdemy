package ContractExercise.services;

import ContractExercise.entities.Contract;
import ContractExercise.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(){}

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months){
        double interestBase = contract.getTotalValue()/(double) months;
        for (int month = 0; month < months ; month++){
            LocalDate dueDate = contract.getDate().plusMonths(month);
            double interest = onlinePaymentService.interest(interestBase, month);
            double fee = onlinePaymentService.paymentFee(interestBase + interest);
            double quota = interestBase + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }

    }
}
