package weekly2;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(int price, int weight) {
        return calculateDeliveryPrice(price, weight);
    }
}
