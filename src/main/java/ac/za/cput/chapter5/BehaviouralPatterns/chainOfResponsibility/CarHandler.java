package ac.za.cput.chapter5.BehaviouralPatterns.chainOfResponsibility;

/**
 * Created by student on 2015/03/13.
 */
public abstract class CarHandler {
    CarHandler successor;

    public void setSuccessor(CarHandler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(CarEnum request);
}