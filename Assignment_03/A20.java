package Assignment_03;
import java.util.Scanner;
public class A20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if((year%4==0 && year%100!=0 )|| (year%400==0)){
            System.out.println("leapyear");
        }else{
            System.out.println("not");
        }
    }
}
