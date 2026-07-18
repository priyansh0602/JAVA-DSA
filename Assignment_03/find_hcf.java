package Assignment_03;
import java.util.Scanner;
public class find_hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = in.nextInt();
        System.out.print("num2: ");
        int num2 = in.nextInt();
        int hcf=0;
        for(int i = 1; i<=num1 && i<= num2; i++){
            if(num1%i==0 && num2%i==0){
            hcf= i;
            }
        }
        System.out.println(hcf);
    }
}

