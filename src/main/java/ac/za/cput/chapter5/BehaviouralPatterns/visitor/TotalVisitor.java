package ac.za.cput.chapter5.BehaviouralPatterns.visitor;

import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class TotalVisitor implements NumberVisitor{

    int totalSum = 0;
    @Override
    public void visit(TwoElement twoElement) {

    }

    @Override
    public void visit(ThreeElement threeElement) {

    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for(NumberElement ne : elementList){
            ne.accept(this);
        }
    }
    public int getTotalSum()
    {
        return totalSum;
    }


}
