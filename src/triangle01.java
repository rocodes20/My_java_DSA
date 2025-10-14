public class triangle01 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1;i<=n;i++){
            int r = 1;
            for(int j = 1;j<=i;j++){
                System.out.print(r);
                if(r==1){
                    r=0;
                }
                else{
                    r =1;
                }
            }
            System.out.println();
        }
    }
}
