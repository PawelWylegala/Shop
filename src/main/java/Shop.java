public class Shop {

    public void order(Order order, Seller seller) {
        System.out.println(String.format("Order: %s from: %s, totalAmount: %.2f zl",order.getClient().getName(),seller.getName(),order.totalAmount()/100.0));
    }
}
