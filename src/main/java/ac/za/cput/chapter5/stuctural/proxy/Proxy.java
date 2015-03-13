package ac.za.cput.chapter5.stuctural.proxy;

import java.util.Date;

/**
 * Created by student on 2015/03/13.
 */
public class Proxy {

    SlowThing slow;

    public Proxy() {
        System.out.println("Createing proxy at: "+ new Date());
    }

    public String sayHello()
    {
        if(slow == null)
        {
            slow = new SlowThing();
        }

        return slow.sayHello();
    }


}