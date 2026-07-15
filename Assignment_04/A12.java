package Assignment_04;
import java.util.Scanner;
public class A12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to primt sum: ");
        int num = in.nextInt();
        int ans = sumof(num);
        System.out.println(ans);
    }
    static int sumof(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum = sum +i;
        }
        return sum;
    }
}