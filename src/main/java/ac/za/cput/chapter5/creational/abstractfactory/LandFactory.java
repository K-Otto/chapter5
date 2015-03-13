package ac.za.cput.chapter5.creational.abstractfactory;

/**
 * Created by student on 2015/03/13.
 */
public class LandFactory extends TransportFactory{

    @Override
    public Transport getTransport(String type) {

        if("Audi".equals(type)){
            return new Car();
        }else{
            return new Bicycle();
        }
    }

}