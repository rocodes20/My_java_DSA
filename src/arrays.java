import java.util.Scanner;

import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int countEven = 0;
        int countOdd = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 4;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
            sum+=arr[i];
            System.out.print(arr[i]+" ");

        }
        System.out.println(sum);
        int avg = sum / arr.length;
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);
        System.out.println(countEven);
        System.out.println(countOdd);
    }
}
