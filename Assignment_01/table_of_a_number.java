package Assignment_01;
import java.util.Scanner;
public class table_of_a_number{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        for(int i = 1; i<=10; i++){
            int table = a*i;
            System.out.println(a + "X" + i + "=" + table);
        }
    }
}
