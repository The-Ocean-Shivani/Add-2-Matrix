public class Pattern3 {
    /*

     * <-i=1,j=1
     **  <-i=2,j=2
     ***

     */
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            { 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
