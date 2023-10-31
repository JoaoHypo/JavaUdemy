package ContractExercise.services;

import ContractExercise.entities.Contract;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(){};

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months){
        // TODO: 10/30/2023  
    }
}
