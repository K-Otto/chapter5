package ac.za.cput.chapter5.creational.builder;

/**
 * Created by student on 2015/03/13.
 */
public interface PersonBuilder {

    public void buildFirstName();
    public void buildLastName();
    public void buildAge();
    public Person getPerson();

}