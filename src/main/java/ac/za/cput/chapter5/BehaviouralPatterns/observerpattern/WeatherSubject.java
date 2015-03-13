package ac.za.cput.chapter5.BehaviouralPatterns.observerpattern;

/**
 * Created by student on 2015/03/13.
 */
public interface WeatherSubject {
    public void addObserver(WeatherObserver weatherObserver);
    public void removeObserver(WeatherObserver weatherObserver);
    public void doNotify();
}