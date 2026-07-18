package Assignment_03;
import java.util.Scanner;
public class average_of_n_numbers {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("enter the number of numbers you want to find avg of: ");   
    int n = in.nextInt();
    float sum = 0;
    float avg;
    for(int i = 1; i<=n; i++){
        System.out.print("enter num: ");
        float num = in.nextFloat();
    sum = sum+num;
    }
    avg = sum/n;
System.out.println(avg);
    }
}

