package ac.za.cput.chapter5.stuctural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/13.
 */
public class FlyweightFactory {

    private static FlyweightFactory flyFactory;
    private Map<String, Flyweight> flyweightpool;

    private FlyweightFactory() {
        flyweightpool = new HashMap<String, Flyweight>();
    }

    public static FlyweightFactory getInstance(){
        if(flyFactory == null){
            flyFactory = new FlyweightFactory();
        }
        return flyFactory;
    }

    public Flyweight getFlyweight(String key) {
        if (flyweightpool.containsKey(key))
        {
            return flyweightpool.get(key);
        }
        else
        {
            Flyweight flyweight;
            if ("add".equals(key))
            {
                flyweight = new FlyweightAdder();
            }
            else
            {
                flyweight = new FlyweightMultiplier();
            }
            flyweightpool.put(key, flyweight );

            return flyweight;
        }
    }



}