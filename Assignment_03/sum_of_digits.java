package Assignment_03;
import java.util.Scanner;;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
       while(num>0){
        int rem = num%10;
        sum = sum + rem;
        num = num/10;
        
       }
       System.out.println(sum);
    }
}
        
