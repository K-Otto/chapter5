package ac.za.cput.chapter5.BehaviouralPatterns.strategy;

/**
 * Created by student on 2015/03/13.
 */
public class Context {
    int tempreatureInF;
    Strategy strategy;

    public Context(int tempreatureInF, Strategy strategy) {
        this.tempreatureInF = tempreatureInF;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int getTempreatureInF(){
        return tempreatureInF;
    }

    public boolean getResult(){
        return strategy.checkTempreature(tempreatureInF);
    }
}