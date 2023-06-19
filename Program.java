package JavaWork.OOPHomeWork.HomeWork_4;

import java.util.ArrayList;

public class Program {
    public static void getWeightBox(ArrayList<Fruit> Box){
        Box<Apple> AppleBox = new Box<>("AppleBox",0);
        double weightApple = 1.0; int quantityApple = 10;
        AppleBox.add(new Apple(weightApple, quantityApple));
        if (AppleBox.getWeightbox() <= Apple.getWeight()) {
            AppleBox.weightbox = Apple.getQuantity() * Apple.getWeight();
            System.out.println("Вес: " + AppleBox.getName() + " = " + AppleBox.weightbox);
        }

        Box<Orange> OrangeBox = new Box<>("OrangeBox",0);
        double weightOrange = 1.5; int quantityOrange = 5;
        OrangeBox.add(new Orange(weightOrange, quantityOrange));
        if (OrangeBox.getWeightbox() <= Orange.getWeight()) {
            OrangeBox.weightbox = Orange.getQuantity() * Orange.getWeight();
            System.out.println("Вес: " + OrangeBox.getName() + " = " + OrangeBox.weightbox);
        }

        int compareBox = Double.compare(AppleBox.getWeightbox(), OrangeBox.getWeightbox());
        boolean result = (compareBox == 0);
        System.out.println("Вес коробок: " + result);
    }
   
    public static void main(String[] args) {
        ArrayList<Fruit> Box = new ArrayList<>();
        getWeightBox(Box);
    }
}
