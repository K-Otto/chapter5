package ac.za.cput.chapter5.stuctural.facade;

/**
 * Created by student on 2015/03/13.
 */
public class Facade {

    public int cubeX(int x)
    {
        Class1 clas = new Class1();
        return clas.doSomethingComplicated(x);
    }

    public int cubeXTimes2(int x)
    {
        Class1 clas = new Class1();
        Class2 clas2 = new Class2();
        return clas2.doAnotherThing(clas, x);
    }

    public int xToSixthPowerTimes2(int x)
    {
        Class1 clas = new Class1();
        Class2 clas2 = new Class2();
        Class3 clas3 = new Class3();

        return clas3.doMoreStuff(clas, clas2, x);
    }

}