package Assignment_04;
import java.util.Scanner;
public class odd_even_function{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num: ");
        int num = in.nextInt();
         oddeven(num);
    }
    static void oddeven(int num){
    if(num%2==0){
    System.out.println("even");
    }else{
        System.out.println("odd");
    }
    }
}


