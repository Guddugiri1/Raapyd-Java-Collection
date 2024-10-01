
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {

    public static void main(String[] args) {
        String s = "Guddu";
        // Set<Character> myset = new HashSet<>();
        // Set<Character> myset = new LinkedHashSet<>();
        Set<Character> myset = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            myset.add(s.charAt(i));
        }
        System.out.println("Given Name =" + s);
        System.out.println("THe unique Characters are");
        Iterator it = myset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
