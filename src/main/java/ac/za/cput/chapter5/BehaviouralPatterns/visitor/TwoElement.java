package ac.za.cput.chapter5.BehaviouralPatterns.visitor;

/**
 * Created by student on 2015/03/13.
 */
public class TwoElement implements NumberElement{
    int a;
    int b;

    public TwoElement(int a, int b){
        this.a = a;
        this.b= b;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}