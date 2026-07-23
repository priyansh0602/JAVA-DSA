package Assignment_05;
import java.util.*;
public class highest_altitude{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length of gain array: ");
        int n = in.nextInt();
        int[] gain = new int[n];
        for(int i = 0; i<gain.length; i++){
        System.out.print("gain at" + i + " index: ");
        gain[i] = in.nextInt();
        }
     int ans = solution(n, gain);
     System.out.println(ans);

    }
    static int solution(int n, int[] gain){
        int start = 0;
        int [] temp = new int[n+1];
        int max = temp[0];
        for(int i = 0; i<gain.length; i++){
        temp[i+1] = gain[i] + start;
        start = temp[i+1];
        if(temp[i+1]>max){
            max = temp[i+1];
        }

        }
        return max;
    }
}
