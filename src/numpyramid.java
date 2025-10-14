public class numpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            int resu = 1;
            for(int j = i;j<=n;j++){
                System.out.print(resu);
                resu++;
            }
            System.out.println();
        }
    }
}
