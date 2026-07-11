package Assignment_03;
import java.util.Scanner;
public class A17 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in); 
         System.out.print("num1: ");
         int num1 = in.nextInt();
        System.out.print("num2: ");
         int num2 = in.nextInt();
         int lcm;
         if(num1>num2){
            lcm = num1;
         }else{
            lcm = num2;
         }
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
    }
}
