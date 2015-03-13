package ac.za.cput.chapter5.BehaviouralPatterns.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class AmericanSeller {
    Mediator mediator;
    float priceInDollars;

    public AmericanSeller(Mediator mediator, float priceInDollars){
        this.mediator = mediator;
        this.priceInDollars= priceInDollars;
        this.mediator.registerAmericanSeller(this);
    }
    public boolean isBidAccepted(float bidInDollars){
        if(bidInDollars>= priceInDollars){
            return true;
        }
        else
            return false;
    }

}