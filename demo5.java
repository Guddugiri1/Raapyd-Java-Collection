
import java.util.Vector;

public class demo5 {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);
        for (int n : v) {
            System.out.println(n + "  ");
        }
    }
}
