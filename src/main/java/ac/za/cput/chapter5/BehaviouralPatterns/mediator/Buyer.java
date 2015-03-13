package ac.za.cput.chapter5.BehaviouralPatterns.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class Buyer {
    Mediator mediator;
    String unitOfCurrency;

    public Buyer(Mediator mediator, String unitOfCurrency){
        this.mediator = mediator;
        this.unitOfCurrency = unitOfCurrency;
    }

    public boolean attemptToPurchase(float bid){
        return mediator.placeBid(bid, unitOfCurrency);
    }
}