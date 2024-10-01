
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // HashMap<Integer, String> mp = new HashMap<>();  // Corrected 'mew' to 'new'
        // mp.put(101, "Guddu");
        // mp.put(102, "Aasha");
        // mp.put(103, "Radhey");
        // mp.put(104, "Pikachu");
        // mp.put(105, "Vandana");
        // mp.put(106, "Siyu");

        // System.out.println(mp);
        // for (Map.Entry item : mp.entrySet()) {
        //     System.out.println(item.getValue() + "\t" + item.getValue());
        // }
        String name = "Guddu";
        int i;
        char ch;
        HashMap<Character, Integer> mp = new HashMap<>();

        // Iterate over the characters of the string
        for (i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            // Check if the character is already in the map
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1); // Add new character with count 1
            } else {
                mp.put(ch, mp.get(ch) + 1); // Increment the count if the character already exists
            }
        }

        // Print the character frequency
        System.out.println("Character\tFrequency");
        for (Map.Entry<Character, Integer> item : mp.entrySet()) {
            System.out.println(item.getKey() + "\t\t" + item.getValue());
        }
    }
}
