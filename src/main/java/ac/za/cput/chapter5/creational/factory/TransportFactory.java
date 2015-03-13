package ac.za.cput.chapter5.creational.factory;

import ac.za.cput.chapter5.creational.abstractfactory.AbstractFactory;

/**
 * Created by student on 2015/03/13.
 */
public class TransportFactory {

    public Transport getTransport(String type){
        if("Audi".equals(type)){
            return new Car();
        }else{
            return new Bicycle();
        }
    }

}