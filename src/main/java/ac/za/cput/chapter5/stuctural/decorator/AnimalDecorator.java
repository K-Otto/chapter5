package ac.za.cput.chapter5.stuctural.decorator;

/**
 * Created by student on 2015/03/13.
 */
public abstract class AnimalDecorator implements Animal{

    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }



}