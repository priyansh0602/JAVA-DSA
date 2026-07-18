package Assignment_02;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number to check if even or odd: ");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println(num+ " is even");
        }else{
            System.out.println(num+ " is ODD");
        }
    }
}
