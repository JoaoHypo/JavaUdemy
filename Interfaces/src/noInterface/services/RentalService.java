package noInterface.services;

import noInterface.entitites.CarRental;
import noInterface.entitites.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;

    private BrazilTaxService brazilTaxService;

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice (CarRental carRental){
        double basicPayment;
        Duration duration = Duration.between(carRental.getStart(), carRental.getFinish());

        if (duration.toHours() > 12){
            if(duration.toHours()%24 != 0){
                basicPayment = ((double) duration.toDaysPart() + 1.0) * pricePerDay ;
            }
            else{
                basicPayment = ((double) duration.toDaysPart()) * pricePerDay ;
            }
        }
        else{
            basicPayment = duration.toHours() * pricePerHour;
        }

        Invoice invoice = new Invoice(basicPayment,brazilTaxService.tax(basicPayment));

        carRental.setInvoice(invoice);
    }
}
