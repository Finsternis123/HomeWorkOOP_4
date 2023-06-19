package JavaWork.OOPHomeWork.HomeWork_4;

public abstract class Fruit {


    protected static double weight;

    protected static int quantity;

    public Fruit(double weight, int quantity) {
        this.weight = weight;
        this.quantity = quantity;
    }

    public static double getWeight() {
        return weight;
    }

    public static int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", quantity=" + quantity +
                '}';
    }
}
