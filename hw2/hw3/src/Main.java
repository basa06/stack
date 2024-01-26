
import java.util.Scanner;
//import ibadts.Stack;
import java.util.Stack;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");

        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        boolean balanced = true;
        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }

            if (map.containsValue(input)) {
                stack.push(input);
            }

            else if (map.containsKey(input)) {
                if (stack.isEmpty() || !stack.peek().equals(map.get(input))) {
                    balanced = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }


        System.out.println(balanced);

    }
}