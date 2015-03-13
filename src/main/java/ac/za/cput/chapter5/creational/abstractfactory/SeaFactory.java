package ac.za.cput.chapter5.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class SeaFactory extends TransportFactory{

    @Override
    public Transport getTransport(String type) {
        if("boat".equals(type)){
            return new Boat();
        }else
        {
            return new JetSki();
        }
    }

}