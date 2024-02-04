package weekly2;

public class Grocery extends Product implements DeliveryChargeCalculator {
    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(int price, int weight) {
        return calculateDeliveryPrice(price, weight);
    }
}
