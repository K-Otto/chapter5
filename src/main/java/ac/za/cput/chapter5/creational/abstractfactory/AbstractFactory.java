package ac.za.cput.chapter5.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class AbstractFactory {

    public TransportFactory getTransportFactory(String type)
    {
        if("land".equals(type)){
            return new LandFactory();
        }else
        {
            return new SeaFactory();
        }
    }

}