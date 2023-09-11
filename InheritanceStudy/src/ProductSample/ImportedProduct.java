package ProductSample;

public final class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return price + customsFee;
    }

    @Override
    public String toString(){
        return String.format("%s $ %.2f (Customs fee: $ %.2f)%n",name,totalPrice(),customsFee);
    }

}
