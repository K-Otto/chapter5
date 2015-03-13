package ac.za.cput.chapter5.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public class PersonDirector {

    private PersonBuilder pb = null;

    public PersonDirector(PersonBuilder pb)
    {
        this.pb = pb;
    }

    public void constructPerson()
    {
        pb.buildFirstName();
        pb.buildLastName();
        pb.buildAge();
    }

    public Person getPerson()
    {
        return pb.getPerson();
    }

}