import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an item");
            System.out.println("1.Plus");
            System.out.println("2.Minus");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            int person = scaner.nextInt();
            int result;
            if (person == 5) {
                break;
            } else if (person == 1) {
                System.out.println("Write a number");
                int a = scaner.nextInt();
                System.out.println("Write the second number");
                int b = scaner.nextInt();
                System.out.println("a:" + a);
                System.out.println("b:" + b);
                result = a + b;
                System.out.println("Answer:" + result);
            } else if (person == 2) {
                System.out.println("Write a number");
                int a = scaner.nextInt();
                System.out.println("Write the second number");
                int b = scaner.nextInt();
                System.out.println("a:" + a);
                System.out.println("b:" + b);
                result = a - b;
                System.out.println("Answer:" + result);
            } else if (person == 3) {
                System.out.println("Write a number");
                int a = scaner.nextInt();
                System.out.println("Write the second number");
                int b = scaner.nextInt();
                System.out.println("a:" + a);
                System.out.println("b:" + b);
                result = a * b;
                System.out.println("Answer:" + result);
            } else if (person == 4) {
                System.out.println("Write a number");
                int a = scaner.nextInt();
                System.out.println("Write the second number");
                int b = scaner.nextInt();
                if (b == 0) {
                    System.out.println("Division is not possible");
                }
                System.out.println("a:" + a);
                System.out.println("b:" + b);
                result = a / b;
                System.out.println("Answer:" + result);
            } else {
                System.out.println("Error");
            }
            System.out.println("Good luck");
        }
    }
}
