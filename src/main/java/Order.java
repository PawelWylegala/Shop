import java.util.List;

public class Order {

    private List<Product> products;
    private Client client;
    public Order(List<Product> products, Client client) {
        this.products = products;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public int totalAmount() {
        return products.stream()
                .map(Product::getPrice).reduce(0,Integer::sum);
    }
}
