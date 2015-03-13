package ac.za.cput.chapter5.BehaviouralPatterns.iterator;

/**
 * Created by student on 2015/03/13.
 */
public class Item {
    String name;
    float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }


}