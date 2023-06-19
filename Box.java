package JavaWork.OOPHomeWork.HomeWork_4;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    protected ArrayList<T> fruits;
    protected String name;
    protected double weightbox;

    public Box(String name, double weightbox) {
        fruits = new ArrayList<>();
        this.name = name;
        this.weightbox = weightbox;
    }
    public void add(T fruit) {
        fruits.add(fruit);
    }
    public String getName() {
        return name;
    }

    public double getWeightbox() {
        return weightbox;
    }

    @Override
    public String toString() {
        return String.format("%s",name);
    }

}



