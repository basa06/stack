import ibadts.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int n = 100000;
        while (n>1){
            stack.push(n);
            n--;

        }
        long sum = n;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
//gives us  a more fundamental understanding of what is happening inside the recursive problem.