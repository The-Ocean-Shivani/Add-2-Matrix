public class PAttern8 {
    /*
     1
     23
     456
     789 10//flyod triangle
     */
  public static void main(String[] args) {
    int n=5;
    int count=1;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(count+" ");
            count++;
            
        }
        System.out.println();
    }

    
  }
    
}
