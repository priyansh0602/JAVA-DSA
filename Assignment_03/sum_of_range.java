package Assignment_03;
import java.util.Scanner;
public class sum_of_range{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting number ");
        int start = in.nextInt();
        System.out.print("Enter ending nuumber: ");
        int end = in.nextInt();
        for(int i = start; i<=end; i++){
        int num = i;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum +(rem*rem*rem);
            num=num/10;
        }
        if(sum==i){
        System.out.println(sum);
        }
        }
    }
}
