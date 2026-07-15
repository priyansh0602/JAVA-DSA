package Assignment_03;
import java.util.Scanner;
public class A23{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int neg_sum=0;
        int odd_sum=0;
        int even_sum=0;
        while(true){
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if(num==0){
            break;
        }
         if(num<0){
            neg_sum = neg_sum + num;
        }
        else if(num%2==0){
            even_sum = even_sum + num;
        }else{
            odd_sum = odd_sum + num;
        }
        }
        System.out.println(neg_sum);
        System.out.println(even_sum);
        System.out.println(odd_sum);

    }
}