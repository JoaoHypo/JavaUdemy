package withInterface.entitites;

public class Invoice {
    private Double basicPayment;
    private Double tax;
    private final Double totalPayment;

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
        totalPayment = getBasicPayment() + getTax();
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }


    @Override
    public String toString() {
        return "Invoice:\n" +
                String.format("Basic Payment: %.2f\n",basicPayment ) +
                String.format("Tax: %.2f\n",tax) +
                String.format("Total Payment: %.2f\n",totalPayment);
    }
}
