import java.util.Iterator;

public interface Liste {
    void add(int index, double element);
    double get(int index);
    Iterator iterator();
    Iterator listIterator();
}
