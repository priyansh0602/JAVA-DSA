package Assignment_02;
import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("num1: ");
        int num1 = in.nextInt();

        System.out.print("num2: ");
        int num2 = in.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = in.next();

        if (op.equals("+")) {
            System.out.println(num1 + num2);
        } else if (op.equals("-")) {
            System.out.println(num1 - num2);
        } else if (op.equals("*")) {
            System.out.println(num1 * num2);
        } else if (op.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator");
        }


    }
}