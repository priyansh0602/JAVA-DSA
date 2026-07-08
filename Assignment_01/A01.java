package Assignment_01;
import java.util.Scanner;
public class A01{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year to check whether leap-year: ");
        int a = in.nextInt();
        if((a%4==0 && a%100 != 0) ||(a%400 == 0) ){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
        }
    }
