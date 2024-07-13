public class Pattern14 {

    /*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
     */
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");//space
            }
            for(int j=2*i-1;j>0;j--)
            {
               System.out.print("*");
            }
            // for(int j=i-1;j>0;j--)
            // {
            //    System.out.print("*");
            // }
            System.out.println();
        }
                    /////////////////////////////////////////////////////////////////////////////////
                    for(int i=1;i<=n;i++)
                    {
                        for(int j=i;j>0;j--)//space
                        {
                            System.out.print(" ");
                        }
                    for(int j=2*(n-i)-1;j>0;j--)
                    {
                       System.out.print("*");
                    }  
                        System.out.println();
                    }
    }
    
}
