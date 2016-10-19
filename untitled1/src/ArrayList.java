import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by butter on 16-10-12.
 */
public class ArrayList {
    private Object[] list;
    private int next;

    public ArrayList(int capacity){
        list = new Object[capacity];

    }

    public ArrayList(){
        this(16);
    }

    public void add(Object o){
        if(next == list.length){
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }

    public Object get(int index){
        if(index < next) return list[index];
        return null;
    }

    public int size(){
        return next;
    }
}
