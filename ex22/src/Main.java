import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        try (Scanner input = new Scanner(System.in))
        {
            while (input.hasNextInt()) {
                stack.push(input.nextInt());
            }

        }
        catch(Exception e){
            System.out.println(e);
            System.exit(1);//nonzero exit code means that there is something wrong
        }



        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}