import ibadts.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        int n = 13;
        while (n>0){
            stack.push(n%2);
            n=n/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}