package ac.za.cput.chapter5.BehaviouralPatterns.state;

/**
 * Created by student on 2015/03/13.
 */
public class Person implements EmotionalState{

    EmotionalState emotionalState;

    public Person(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }

    public void setEmotionalState(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }

    @Override
    public String sayHello() {
        return emotionalState.sayHello();
    }

    @Override
    public String sayGoodbye() {
        return emotionalState.sayGoodbye();
    }

}