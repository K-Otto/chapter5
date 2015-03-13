package ac.za.cput.chapter5.BehaviouralPatterns.command;

/**
 * Created by student on 2015/03/13.
 */
public class DinnerCommand implements Command{
    Dinner dinner;

    public DinnerCommand(Dinner dinner){
        this.dinner = dinner;
    }

    @Override
    public void execute() {
        dinner.makeDinner();
    }
}
