package ac.za.cput.chapter5.stuctural.decorator;

/**
 * Created by student on 2015/03/13.
 */
public class WingDecorator extends AnimalDecorator{

    public WingDecorator(Animal animal) {
        super(animal);
    }

    public String describe() {
        animal.describe();
        fly();
        return "I have wings";

    }

    public void fly()
    {
        System.out.println("I can fly");
    }



}