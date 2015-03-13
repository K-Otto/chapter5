package ac.za.cput.chapter5.BehaviouralPatterns.command;

/**
 * Created by student on 2015/03/13.
 */
public class MealInvoker {
    Command command;

    public MealInvoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }
}