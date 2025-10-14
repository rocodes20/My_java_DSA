public class solidrhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int sp = 1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int st =1;st<=n;st++){
                if(st == 1 || st == n || i == 1 || i == n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
