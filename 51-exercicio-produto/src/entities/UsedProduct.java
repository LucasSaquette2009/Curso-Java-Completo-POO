package entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {

    private LocalDate manufactureDate;

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() +
                String.format(" (used) $ %.2f ", getPrice())
                +
                "(Manufacture date: " + fmt.format(manufactureDate)
                + ")";
    }
}
