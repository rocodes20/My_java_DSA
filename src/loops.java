import java.util.*;
public class loops {
    public static void main(String[] args) {
        int n = 5;
        int sum =0;
        for(int i =0;i<=n;i++){
            System.out.println(i);
            sum+=i;

        }
        System.out.println(sum);
        do{
            System.out.println(n);
            n--;
        }while(n>1);
    }
}
