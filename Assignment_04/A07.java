package Assignment_04;
import java.util.Scanner;
public class A07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter marks: ");
    int marks = in.nextInt();
    grade(marks);
  }  
  static void grade(int marks){
if(marks>=91 && marks<=100){
    System.out.println("AA");
}else if(marks>=81 && marks<=90){
    System.out.println("AB");
}else if(marks>=71 && marks<=80){
    System.out.println("BB");
}else{
    System.out.println("fail");
}
}
}
