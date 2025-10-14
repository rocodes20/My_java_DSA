public class frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,1};
        int target = 1;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
