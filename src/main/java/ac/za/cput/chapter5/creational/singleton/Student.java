package ac.za.cput.chapter5.creational.singleton;

/**
 * Created by student on 2015/03/13.
 */
public class Student {

    private static Student myStudent;
    private String name = "Test";

    private Student()
    {

    }

    public synchronized static Student instance(){
        if(myStudent == null){
            myStudent = new Student();
        }
        return myStudent;
    }

    public String getName(){
        return name;
    }

}