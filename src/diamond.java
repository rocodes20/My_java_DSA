public class diamond {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){
            for(int sp = 1;sp<= n -i;sp++){
                System.out.print(" ");
            }
            for(int st = 1;st<=(i*2)-1;st++){
                if(st == 1 || st == (i*2)-1 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int sp = 1;sp<= n -i;sp++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int sp = 1;sp<= n -i;sp++){
                System.out.print(" ");
            }
            for(int st = 1;st<=(i*2)-1;st++){
                if(st == 1 || st == (i*2)-1 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int sp = 1;sp<= n -i;sp++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
