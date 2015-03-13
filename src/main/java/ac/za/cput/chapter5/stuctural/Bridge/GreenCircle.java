package ac.za.cput.chapter5.stuctural.Bridge;

/**
 * Created by student on 2015/03/13.
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Iam drawing a green circle of radius: "+ radius+" x: "+ x+" y: "+ y);
    }

}