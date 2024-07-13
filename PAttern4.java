public class PAttern4 {
    /*
     * [
      +++++  <=i=0,j=5
      ++++  <=i=1,j=4
      +++  <i=2,j=3
      ++
      +
          ]
     */
    public static void main(String[] args) {
        int n=5,m=5;
        for(int i=0;i<=n;i++)//outer loop
        {
            for(int j=m-i;j>0;j--)//inner loop
            {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
