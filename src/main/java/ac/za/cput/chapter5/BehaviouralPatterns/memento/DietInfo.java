package ac.za.cput.chapter5.BehaviouralPatterns.memento;

/**
 * Created by student on 2015/03/13.
 */
public class DietInfo {
    String personName;
    int dayNumber;
    int weight;

    public DietInfo(String personName, int dayNumber, int weight){
        this.personName = personName;
        this.dayNumber =dayNumber;
        this.weight= weight;
    }

    @Override
    public String toString() {
        return "DietInfo{" + "personName=" + personName + ", dayNumber=" + dayNumber + ", weight=" + weight + '}';
    }

    public void setDayNumberAndWeight(int dayNumber, int weight){
        this.dayNumber= dayNumber;
        this.weight=weight;
    }
    public Memento save(){
        return new Memento(personName, dayNumber, weight);
    }
    public int getWeight()
    {return weight;}
    public void restore(Object objMemento){
        Memento memento= (Memento) objMemento;
        personName = memento.mementoPersonName;
        dayNumber = memento.mementoDayNumber;
        weight = memento.mementoWeight;
    }
    private class Memento{
        String mementoPersonName;
        int mementoDayNumber;
        int mementoWeight;

        public Memento(String personName, int dayNumber, int weight){
            mementoPersonName = personName;
            mementoDayNumber =dayNumber;
            mementoWeight= weight;
        }
    }
}