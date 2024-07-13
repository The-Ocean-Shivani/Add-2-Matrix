public class Recursion5 {
    //fibonacci series 
    //10 1 1 2 3 5 8
   static int a = 0, b = 1;

    public static void  printfibo( int n)
   {
        if(n>0)
        {
          int  c=a+b;
          a=b;
          b=c;
          System.out.println(c);
          printfibo(n-1);
        }
    }

    public static void main(String[] args) {
        int n=2;
        if(n==1)
        {
            System.out.println(a);
        }
        if(n==2)
        {
            System.out.println(a+" "+b);//printing a &b
        }
        printfibo(n-2); //becoz two number already print
    }

}
