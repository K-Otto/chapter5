package ac.za.cput.chapter5.BehaviouralPatterns.memento;

/**
 * Created by student on 2015/03/13.
 */
public class DietInfoCaretaker {
    Object objMemento;


    public void restoreState(DietInfo dietInfo){
        dietInfo.restore(objMemento);
    }

    public void saveState(DietInfo dietInfo) {
        objMemento= dietInfo.save();
    }

}