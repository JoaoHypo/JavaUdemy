package noInterface.services;

public final class BrazilTaxService {

    public Double tax (Double amount){
        return amount > 100.0 ? amount * 0.15 : amount * 0.2 ;
    }
}
