package ac.za.cput.chapter5.BehaviouralPatterns.observerpattern;

/**
 * Created by student on 2015/03/13.
 */
public class WeatherCustomer1 implements WeatherObserver{

    @Override
    public void doUpdate(int tempreature) {
        System.out.println("Weather customer 1 just found out the tempreature is: " + tempreature);
    }

}