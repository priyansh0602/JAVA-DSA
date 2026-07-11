package Assignment_03;
import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number of sems: ");
        int sem = in.nextInt();
        float total_cgpa = 0;
        float total_ccgpa;
        for(int i = 1; i<=sem; i++){
        System.out.print("cgpa in "+ i + "sem: ");
        float cgpa = in.nextFloat(); 
        total_cgpa =total_cgpa + cgpa;
        }
        total_ccgpa = total_cgpa/sem;
        System.out.println(total_ccgpa);
    }
}
