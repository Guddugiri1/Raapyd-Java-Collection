
import java.util.ArrayList;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter Five Values");
        for (i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("The Given Values are:");
        for (Integer n : al) {
            System.out.println(n + " ");
        }
    }
}
