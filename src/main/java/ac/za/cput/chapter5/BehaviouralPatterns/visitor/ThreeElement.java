package ac.za.cput.chapter5.BehaviouralPatterns.visitor;

/**
 * Created by student on 2015/03/13.
 */
public class ThreeElement implements NumberElement{
    int a;
    int b;
    int c;
    public ThreeElement(int a, int b, int c){
        this.a = a;
        this.b= b;
        this.c= c;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}