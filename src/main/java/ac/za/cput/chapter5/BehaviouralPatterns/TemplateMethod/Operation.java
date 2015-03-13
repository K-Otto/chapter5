package ac.za.cput.chapter5.BehaviouralPatterns.TemplateMethod;

/**
 * Created by student on 2015/03/13.
 */

    public abstract class Operation {
        public final String operate1(){
            return prepareForOperation()+ operate()+ sucess()+ cleanUp();
        }
        public abstract String prepareForOperation();
        public abstract String operate();
        public String sucess()
        {
            return "Operation not successful. ";
        }
        public abstract String cleanUp();
    }
