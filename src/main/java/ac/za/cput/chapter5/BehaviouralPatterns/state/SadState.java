package ac.za.cput.chapter5.BehaviouralPatterns.state;

/**
 * Created by student on 2015/03/13.
 */
public class SadState implements EmotionalState{

    @Override
    public String sayHello() {
        return "Bye, sniff, sniff";
    }

    @Override
    public String sayGoodbye() {
        return "Hello, sniff, sniff";
    }

}