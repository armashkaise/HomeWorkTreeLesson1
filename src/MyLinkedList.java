import java.util.LinkedList;

public class MyLinkedList extends LinkedList {
    @Override
    public String toString() {
        String values = "";
        for (Object i : this){
            values += i;
        }
        return "Значения линкеда равны: " + values;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
