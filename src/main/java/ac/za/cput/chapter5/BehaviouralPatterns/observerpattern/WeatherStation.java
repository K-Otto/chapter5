package ac.za.cput.chapter5.BehaviouralPatterns.observerpattern;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/03/13.
 */
public class WeatherStation implements WeatherSubject{
    Set<WeatherObserver> weatherObservers;
    int tempreature;

    public WeatherStation(int temppreature) {
        weatherObservers = new HashSet<WeatherObserver>();
        this.tempreature = tempreature;
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void doNotify() {
        Iterator<WeatherObserver> it = weatherObservers.iterator();
        while(it.hasNext()){
            WeatherObserver weatherObserver = it.next();
            weatherObserver.doUpdate(tempreature);
        }
    }


    public void setTempreature(int newTempreature){
        System.out.println("\nWeather station setting tempreature to " + newTempreature);
        tempreature = newTempreature;
        doNotify();
    }

    public int getTempreature() {
        return tempreature;
    }

}