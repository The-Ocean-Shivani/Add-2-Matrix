import java.util.Scanner;
//sum of n natural number
public class Recursion3 {
    public static void Sum(int n)
    {
       int s=0;
   for(int i=0;i<=n;i++)
   {
   s=i+s;
   }
   System.out.println(s);
    }
    public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number to be sum");
int n=sc.nextInt();
//int n= 5;
       
        Sum(n);
    }
    
}
