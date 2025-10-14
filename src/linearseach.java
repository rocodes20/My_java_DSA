public class linearseach {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,3};
        int target = 6;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("target found at index "+ i);
            }
        }
    }
}
