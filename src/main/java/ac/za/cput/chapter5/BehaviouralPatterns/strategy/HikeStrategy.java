package ac.za.cput.chapter5.BehaviouralPatterns.strategy;

/**
 * Created by student on 2015/03/13.
 */
public class HikeStrategy implements Strategy{

    @Override
    public boolean checkTempreature(int tempreatureInF) {
        if((tempreatureInF >= 50)&&(tempreatureInF <= 90)){
            return true;
        }else return false;
    }

}