public class Printsum {
    public static void printsm(int i,int n,int sum)
    {
if(i==n)//base case for end
{
    sum+=i;
    System.out.println(sum+" ");
    return;
}

        sum+=i;
        printsm(i+1, n, sum);
    }
    public static void main(String[] args) {
        printsm(1, 5, 0);

        
    }
    
}
