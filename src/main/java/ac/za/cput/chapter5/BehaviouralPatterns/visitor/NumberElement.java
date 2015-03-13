package ac.za.cput.chapter5.BehaviouralPatterns.visitor;

/**
 * Created by student on 2015/03/13.
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}