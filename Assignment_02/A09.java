package Assignment_02;
import java.util.Scanner;
public class A09{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("start: ");
        int a = in.nextInt();
        System.out.print("End: ");
        int b = in.nextInt();
        for(int i = a; i<=b; i++){
            int num = i;
            int sum = 0;
            while(num>0){
        int rem = num%10;
        sum = sum + (rem*rem*rem);
        num = num/10;

            }
            if(sum == i){
        System.out.println(sum);
            }
        }
    }
}