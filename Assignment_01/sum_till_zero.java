package Assignment_01;
import java.util.Scanner;
public class sum_till_zero {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    int sum = 0;
    while(true){
        System.out.print("Enter a number to add and zero to add all ");
        int num = in.nextInt();
        if(num == 0){
            break;
        }
        sum = sum + num;
    }
    System.out.print(sum);
    }
}
