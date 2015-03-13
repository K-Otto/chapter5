package ac.za.cput.chapter5.BehaviouralPatterns.observerpattern;

/**
 * Created by student on 2015/03/13.
 */
public class WeatherCustomer2 implements WeatherObserver{

    @Override
    public void doUpdate(int tempreature) {
        System.out.println("Weather customer 2 just found out the tempreature is: " + tempreature);
    }
}