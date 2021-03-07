public class Workwear extends Product {
    private String workwearSize;

    public Workwear(String name, double price, String workwearSize) {
        super(name, price);
        this.workwearSize = workwearSize;
    }

    public String getWorkwearSize() {
        return workwearSize;
    }
}