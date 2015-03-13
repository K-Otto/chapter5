package ac.za.cput.chapter5.BehaviouralPatterns.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class SwedishBuyer extends Buyer{
    public SwedishBuyer(Mediator mediator){
        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}