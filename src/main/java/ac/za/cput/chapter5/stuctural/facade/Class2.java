package ac.za.cput.chapter5.stuctural.facade;

/**
 * Created by student on 2015/03/13.
 */
public class Class2 {

    public int doAnotherThing(Class1 clas, int x)
    {
        return 2 * clas.doSomethingComplicated(x);
    }

}