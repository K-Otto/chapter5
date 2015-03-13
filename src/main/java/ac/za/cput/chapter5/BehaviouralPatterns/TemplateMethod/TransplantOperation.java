package ac.za.cput.chapter5.BehaviouralPatterns.TemplateMethod;

/**
 * Created by student on 2015/03/13.
 */
public class TransplantOperation extends Operation {

    @Override
    public String prepareForOperation() {
        return "Get equipment ready. ";
    }

    @Override
    public String operate() {
        return "Operating on patient. ";
    }

    @Override
    public String cleanUp() {
        return "Cleaning up after operation.";
    }

}