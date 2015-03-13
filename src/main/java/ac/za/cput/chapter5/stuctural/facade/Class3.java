package ac.za.cput.chapter5.stuctural.facade;

/**
 * Created by student on 2015/03/13.
 */
public class Class3 {

    public int doMoreStuff(Class1 clas, Class2 clas2, int x)
    {
        return clas.doSomethingComplicated(x) * clas2.doAnotherThing(clas, x);
    }

}