public class Pattern5 {
    /*
     * [
          + <<=space=3,i=1
         ++  <=space=2,i=2
        +++  <=space=3,i=3
       ++++  <=space=0,i=4
      ]
     */
    public static void main(String[] args) {
        int n=5;
    
        
        for(int i=0;i<=n;i++)//outer loop
        {   
            for(int j=n-i;j>0;j--)//inner loop for spac
            {
              
               System.out.print(" ");
            }
            for(int j=n-i;j<=n;j++)//inner loop for *
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
