public class Pattern9 {
    /*
     1     <-(1,1)
     01    <-(2,1)(2,2)
     101   <-(3,1)(3,2)(3,3)
     0101  <-(4,1)(4,2)(4,3)(4,4)
     */
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
    }
    
}
