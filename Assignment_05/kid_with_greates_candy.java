package Assignment_05;
import java.util.*;
public class kid_with_greates_candy {
    public static void main(String[] args) {
        int extracandies = 3;
        Scanner in = new Scanner(System.in);
        System.out.print("number of kids: ");
        int n = in.nextInt();
        int[] candies = new int[n] ;
        for(int i = 0; i<candies.length; i++){
            System.out.print( i +"st kid have candies ");
            candies[i] = in.nextInt();
        }
        List<Boolean> ans = kidswithcandies(candies, extracandies);
            System.out.println(ans);

    }
    static List<Boolean> kidswithcandies(int[] candies, int extracandies){
      int max = candies[0];
      List <Boolean> maximum = new ArrayList<>();
      for(int i = 0; i<candies.length; i++){
        if(candies[i]> max){
            max = candies[i];
        }
      }
      for(int i = 0; i<candies.length; i++){
        if(candies[i]+extracandies >= max){
          maximum.add(true);
        }else{
            maximum.add(false);
        }
      }
              return maximum;
    }
}
