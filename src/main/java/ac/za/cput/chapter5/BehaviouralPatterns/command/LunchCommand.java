package ac.za.cput.chapter5.BehaviouralPatterns.command;

/**
 * Created by student on 2015/03/13.
 */
public class LunchCommand implements Command{
    Lunch lunch;

    public LunchCommand(Lunch lunch) {
        this.lunch = lunch;
    }

    @Override
    public void execute() {
        lunch.makeLunch();
    }
}