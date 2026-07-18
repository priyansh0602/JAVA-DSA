package Assignment_03;
public class even_days_in_month {
    public static void main(String[] args) {
    int days_out=0;
    for(int i = 1; i<=31; i++){
    if(i%2==0){
        days_out =days_out + 1;
    }
        }
        System.out.println(days_out);
    }
}

