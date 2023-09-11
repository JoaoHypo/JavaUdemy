package ProductSample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product{

    private LocalDate manufactureDate;

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public static DateTimeFormatter getFmt() {
        return fmt;
    }

    @Override
    public String toString() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)%n",name,price,getManufactureDate().format(fmt));
    }
}
