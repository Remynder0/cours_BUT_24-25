import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListe implements Liste {
    private ArrayList<Double> list;

    public ArrayListe() {
        list = new ArrayList<>();
    }

    @Override
    public void add(int index, double element) {
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
