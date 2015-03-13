package ac.za.cput.chapter5.stuctural.decorator;

/**
 * Created by student on 2015/03/13.
 */
public class LegDecorator extends AnimalDecorator{

    public LegDecorator(Animal animal) {
        super(animal);
    }

    public String describe() {
        animal.describe();
        dance();
        return "I have legs";

    }

    public void dance()
    {
        System.out.println("I can dance");
    }



}