public class Fibnonacci {

    public static void fib(int n,int prev1,int prev2)
    {
        if (n < 3) {
            return;
        }
        int fn=0;
        fn=prev1 + prev2;
        prev1=prev2;
        prev2=fn;
        System.out.print(fn+" ");
       fib(n-1, prev1, prev2);
    }

    public static void check(int n)
    {
        if(n<1)
        {
            System.out.println("Invalid number");
        }
       else if(n==1)
        {
            System.out.println("0");
        }
       else if(n==2)
        {
            System.out.println("0 1");
        }
    else
        {
            System.out.print("0 1 ");
            fib(n, 0,1);

        }
     
    
    }
    public static void main(String[] args) {
        int n=9;
        check(n);
      

    }
    
}
