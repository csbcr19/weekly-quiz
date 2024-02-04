package weekly2;

public abstract class Product {
    String name;
    int price;
    int weight;

    Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    int calculateDeliveryPrice(int price, int weight) {
        if (price < 30000) {
            return calculateWeight(weight);
        } else if (price < 100000){
            return calculateWeight(weight) - 1000;
        } else {
            return 0;
        }
    }

    int calculateWeight(int weight) {
        if (weight < 3) {
            return 1000;
        } else if (weight < 10) {
            return 5000;
        } else {
            return 10000;
        }
    }
}
