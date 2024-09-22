import java.util.List;

public class ShopExample {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Seller seller1 = new Seller("Magdalena");
        Client client1 = new Client("Tomek");

        Order order1 = new Order(
                List.of(new Product("Bread",455),new Product("Bread",455),
                        new Product("Roll",170),new Product("Roll",170),new Product("Roll",170),new Product("Roll",170),
                        new Product("Milk",350),
                        new Product("Eggs",1200))
        ,client1);

        shop.order(order1, seller1);

        Client client2 = new Client("Lucja");
        Seller seller2 = new Seller("Marek");

        Order order2 = new Order(
                List.of(new Product("Donut", 100),new Product("Donut", 100),new Product("Donut", 100),new Product("Donut", 100),
                        new Product("Orange jocie", 500)),client2);

        shop.order(order2,seller2);


    }
}
