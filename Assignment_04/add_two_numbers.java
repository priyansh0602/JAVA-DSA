package Assignment_04;
import java.util.Scanner;
public class add_two_numbers {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("num1: ");
    int num1 = in.nextInt();
    System.out.print("num2: ");
    int num2 = in.nextInt();
    int sum = add(num1, num2);
    System.out.println(sum);
    }    
    static int add(int num1, int num2){
        return num1 + num2;
    }
}

