import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListe implements Liste {
    private LinkedList<Double> list;

    public LinkedListe() {
        list = new LinkedList<>();
    }

    @Override
    public void add(int index,double element) {
        list.add(index,element);
    }
    

    @Override
    public double get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public Iterator listIterator() {
        return list.iterator();
    }
}
