public class Pattern10 {
    /* rombos
          ******
         ******
       ******
      ******
     ****** 
     */
   

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)//for row
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)//for coumn
            {
               for( j=1;j<=n;j++){
                System.out.print("* ");//for print *
               }
            }
            System.out.println();
        }
    }
    
}
    

