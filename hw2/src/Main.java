import ibadts.Stack;
import ibadts.StaticStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaticStack<Integer>staticStack= new StaticStack<>(5);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()&&!staticStack.isFull()){
            staticStack.push(scanner.nextInt());
        }
        while(!staticStack.isEmpty()){
            System.out.println(staticStack.pop());
        }
    }
}