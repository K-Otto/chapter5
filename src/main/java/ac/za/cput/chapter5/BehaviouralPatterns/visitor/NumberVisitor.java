package ac.za.cput.chapter5.BehaviouralPatterns.visitor;

import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public interface NumberVisitor {
    public void visit(TwoElement twoElement);
    public void visit(ThreeElement threeElement);
    public void visit(List<NumberElement> elementList);
}