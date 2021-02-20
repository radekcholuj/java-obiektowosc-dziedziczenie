public class Fertilizer extends Product {
    private String purpose;

    public Fertilizer(String name, double price, String purpose) {
        super(name, price);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }
}