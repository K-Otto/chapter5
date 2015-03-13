package ac.za.cput.chapter5.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class PersonOne implements PersonBuilder{

    private Person person;

    public PersonOne(){
        person = new Person();
    }

    public void buildFirstName() {
        person.setFirstName("Tracy");
    }

    public void buildLastName() {
        person.setLastName("Robb");
    }

    public void buildAge() {
        person.setAge(23);

    }

    public Person getPerson() {
        return person;
    }

}