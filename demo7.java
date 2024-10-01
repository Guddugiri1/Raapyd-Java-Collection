
import java.util.Stack;

public class demo7 {

    public static void main(String[] args) {
        String s = "Guddu";
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }
        while (!stk.empty()) {
            System.out.print(stk.peek());
            stk.pop();
        }
    }
}
