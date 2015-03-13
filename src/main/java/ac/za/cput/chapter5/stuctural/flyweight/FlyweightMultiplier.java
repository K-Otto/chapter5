package ac.za.cput.chapter5.stuctural.flyweight;

/**
 * Created by student on 2015/03/13.
 */
public class FlyweightMultiplier implements Flyweight{

    String operation;

    public FlyweightMultiplier() {

        operation = "multiplying";

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public int doMath(int a, int b) {
        return (a * b);
    }

}