public class Flower extends Product {
    private String type;

    public Flower(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
