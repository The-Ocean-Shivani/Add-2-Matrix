public class Pattern13 {
    /*
     
     */
    public static void main(String args[])
    {
        int n=4;

        /*
*      *
**    **
***  ***
******** 


  */
        for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=i;j++)
            {
                
                System.out.print("*");
            }
            
            for(int j=2*(n-i);j>0;j--)
            {
                System.out.print(" ");//for space
            }

            // for(int j=(n-i);j>0;j--)
            // {
            //     System.out.print(" ");//for space
            // }



            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //lower butterfuly
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i+1;j>0;j--)/*
            ****
            ***
            **
            *
             */
            {
                System.out.print("*");
            }
            for(int j=2*(i-1);j>0;j--)//for lower mid space
            {
                System.out.print(" ");
            }

            // for(int j=(i-1);j>0;j--)
            // {
            //     System.out.print(" ");//for lower mid space
            // }

            for(int j=n-i+1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
