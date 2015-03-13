package ac.za.cput.chapter5.stuctural.Bridge;

/**
 * Created by student on 2015/03/13.
 */
public class Circle extends Shape{
    private int x,y,radius;

    public Circle(int x,int y,int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);    }

}