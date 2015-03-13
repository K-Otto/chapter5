package ac.za.cput.chapter5.creational.prototype;

/**
 * Created by student on 2015/03/13.
 */
public class Person implements Prototype {
    String name;
    public Person (String name){
        this.name=name;
    }
    @Override
    public Prototype cloner() {
        return new Person(name);
    }
    public String getName(){
        return "Person's name is " +name;
    }
}