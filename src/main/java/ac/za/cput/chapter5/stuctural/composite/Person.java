package ac.za.cput.chapter5.stuctural.composite;

/**
 * Created by student on 2015/03/13.
 */
public class Person  implements Component{

    String name;

    public Person(String name) {
        this.name = name;
    }



    public void sayHello() {

        System.out.println(name + " person says hello");

    }

    public void sayGoodbye() {

        System.out.println(name + " person says goodbye");
    }

}