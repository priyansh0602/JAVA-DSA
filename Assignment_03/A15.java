package Assignment_03;
import java.util.Scanner;
public class A15{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number to check whether its palindrome or not: ");
        int num = in.nextInt();
        int rev = 0;
        int original = num;
        while(num>0){
            int rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
            }
                if(original == rev){
        System.out.println("Palindrome");
             } else{
                System.out.print("not palindrome");
             }
        }
    }
