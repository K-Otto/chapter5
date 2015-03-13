package ac.za.cput.chapter5.BehaviouralPatterns.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class FrenchBuyer extends Buyer{

        public FrenchBuyer(Mediator mediator){
            super(mediator, "euro");
            this.mediator.registerFrenchBuyer(this);
        }
    }


