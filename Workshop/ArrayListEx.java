
import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList <Integer> vals = new ArrayList();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.err.println( vals.get(0) );

    for (Integer i : vals) {
        System.out.println("Values -"+i);
        }
    }

}
