
import java.util.Hashtable;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        Map<Integer, String> mp = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        mp.put(101, "Guddu");
        mp.put(102, "Pikachu");
        mp.put(103, "Radhey");
        mp.put(104, "Vandana");
        mp.put(105, "Siyu");
        mp.put(106, "Aasha");

        // Corrected lambda expression in the forEach method
        mp.forEach((k, v) -> {
            System.out.println(k + "\t" + v);
        });
    }
}
