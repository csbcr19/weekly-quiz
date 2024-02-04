package weekly2;

public class Main {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("립밤", 10000, 1);
        Grocery grocery = new Grocery("아이스크림", 30000, 5);
        LargeAppliance largeAppliance = new LargeAppliance("냉장고", 300000, 15);


        System.out.println("화장품: " + beauty.name + " 배송비는 " + beauty.getDeliveryCharge(beauty.price, beauty.weight )+"원");
        System.out.println("식료품: " + grocery.name + " 배송비는 " + grocery.getDeliveryCharge(grocery.price, grocery.weight )+"원");
        System.out.println("대형가전: " + largeAppliance.name + " 배송비는 " + largeAppliance.getDeliveryCharge(largeAppliance.price, largeAppliance.weight )+"원");
    }
}
