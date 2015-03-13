package ac.za.cput.chapter5.stuctural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Composite implements Component{

    List<Component> components = new ArrayList<Component>();

    public void sayHello() {
        for (Component component : components)
        {
            component.sayHello();
        }
    }

    public void sayGoodbye() {
        for (Component component : components)
        {
            component.sayGoodbye();
        }
    }

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }

    public List<Component> getComponents()
    {
        return components;
    }

    public Component getComponent(int index)
    {
        return components.get(index);
    }


}