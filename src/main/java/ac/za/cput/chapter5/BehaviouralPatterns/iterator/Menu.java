package ac.za.cput.chapter5.BehaviouralPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Menu {
    List<Item> menuItems;

    public Menu() {
        menuItems = new ArrayList<Item>();
    }

    public void addItem(Item item){
        menuItems.add(item);
    }

    public Iterator<Item> iterator(){
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<Item> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= menuItems.size()){
                return false;
            }else return true;
        }

        @Override
        public Item next() {
            return menuItems.get(currentIndex++);
        }

        @Override
        public void remove(){
            menuItems.remove(--currentIndex);
        }

    }

}
