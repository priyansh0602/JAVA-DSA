package Assignment_04;
public class A09{
    public static void main(String[] args) { 
        boolean ans = palindrome(2332);
        if(ans){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    static boolean palindrome(int num){
        int rev = 0;
        int original = num;

        while(num>0){
            int rem = num%10;
            rev = rev *10 + rem;
            num = num/10;

        }
       if(rev==original){
        return true;
       }else 
       {
        return false;
       }
    }
}