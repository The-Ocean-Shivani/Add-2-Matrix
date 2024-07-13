public class Pattern12 {
  /*
    1
   212
  32123
 4321234
543212345
   */
    public static void main(String[] args) {
        int n=5;
        //for left side triangle
        for(int i=1;i<=n;i++)
        {
       for(int j=n-i;j>0;j--)//for print space
       {
        System.out.print(" ");
       }
       for(int j=i;j>0;j--)
       {
        System.out.print(j+"");
       }


      /*
       2 <-i=2,j=2
       23 <-i=3,j=2,3
       234
       2345
       */
      for(int j=2;j<=i;j++)
      {
          System.out.print(j+"");//for different num print j
      }

       System.out.println();
        }


        //for right side triangle
       
       
        
    }
    
}
