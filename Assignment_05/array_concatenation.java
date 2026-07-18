package Assignment_05;
import java.util.Scanner;
public class array_concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array1: ");
        int a = in.nextInt();
        int [] arr1 = new int[a];
        for(int i = 0; i<arr1.length; i++){
            System.out.print("value at " + i + " index: ");
            arr1[i] = in.nextInt();
        }
           System.out.print("Enter length of array2: ");
        int b = in.nextInt();
        int [] arr2 = new int[b];
        for(int i = 0; i<arr2.length; i++){
            System.out.print("value at " + i + " index: ");
            arr2[i] = in.nextInt();
        }
        int[] ans = concatination(arr1, arr2);
        for(int i = 0; i<ans.length; i++){
         System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
     static int[] concatination(int[] arr1, int[] arr2){
            int[] combined = new int[arr1.length + arr2.length];
            for(int i = 0; i<arr1.length; i++){
                combined[i] = arr1[i];
            }
           for(int i = 0; i<arr2.length; i++ ){
            combined[arr1.length + i] = arr2[i];
           }
           return combined;
        }
}

