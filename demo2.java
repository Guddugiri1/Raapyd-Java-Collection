
import java.util.ArrayList;
import java.util.Iterator;

public class demo2 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Guddu");
        arr.add("Ram");
        arr.add("Shyam");
        arr.add("Krishn");
        arr.add("Radha");
        arr.add("Sita");
        Iterator<String> it = arr.iterator();
        // System.out.println(it.next());
        it.next();
        it.remove();
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");

        }

    }
}
