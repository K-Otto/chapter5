package ac.za.cput.chapter5.stuctural.flyweight;

/**
 * Created by student on 2015/03/13.
 */
public class FlyweightAdder implements Flyweight{

    String operation;

    public int doMath(int a, int b) {
        return (a + b);
    }

    public FlyweightAdder() {
        operation = "adding";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }



}