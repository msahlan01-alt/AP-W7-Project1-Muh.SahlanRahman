package lab.activity.week;

public class Invoice implements IPayable {
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, int quantity, double pricePerItem) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}