public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){
            //star
            for(int st = 1;st<=i;st++){
                System.out.print("*");
            }
            for(int sp = 1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            for(int st = 1;st<=i;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            //star
            for(int st = 1;st<=i;st++){
                System.out.print("*");
            }
            for(int sp = 1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            for(int st = 1;st<=i;st++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
