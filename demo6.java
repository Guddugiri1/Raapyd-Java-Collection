
import java.util.ArrayList;
import java.util.Collections;

public class demo6 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(3);
        al.add(40);
        al.add(5);

        for (int n : al) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Correct usage of Collections.max() and Collections.min()
        System.out.println("Largest Element = " + Collections.max(al));
        System.out.println("Smallest Element = " + Collections.min(al));

        // Correct sorting of the list in ascending order
        Collections.sort(al);
        System.out.println("After Sort in Ascending Order:");
        for (int n : al) {
            System.out.print(n + " ");
        }
        // System.out.println();

        // Sorting the list in descending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("After Sort in Descending Order:");
        for (int n : al) {
            System.out.print(n + " ");
        }
        Collections.reverse(al);
        System.out.println("After Sort in Ascending Order:");
        for (int n : al) {
            System.out.print(n + " ");
        }
        System.out.println("");
        System.out.println(Collections.binarySearch(al, 5));
    }
}
