package ac.za.cput.chapter5.stuctural.Bridge;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }
    public abstract void draw();
}