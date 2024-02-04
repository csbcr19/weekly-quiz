package weekly2;

public class Beauty extends Product implements DeliveryChargeCalculator{
    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(int price, int weight) {
        return calculateDeliveryPrice(price, weight);
    }
}
