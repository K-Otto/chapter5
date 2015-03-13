package ac.za.cput.chapter5.stuctural.proxy;

/**
 * Created by student on 2015/03/13.
 */
public class SlowThing extends Thing{

    //takes 5 seconds to execute
    public SlowThing() {
        try{
            Thread.sleep(5000);
            System.out.println("Created slow thing");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }



}