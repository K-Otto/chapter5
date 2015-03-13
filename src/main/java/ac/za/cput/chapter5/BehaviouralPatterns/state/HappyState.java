package ac.za.cput.chapter5.BehaviouralPatterns.state;

/**
 * Created by student on 2015/03/13.
 */
public class HappyState implements EmotionalState{

    @Override
    public String sayHello() {
        return "Hello, friend";
    }

    @Override
    public String sayGoodbye() {
        return "Bye, friend";
    }

}