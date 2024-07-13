import java.util.Scanner;
public class Recursion4 {
    //print Factorial of a number n 

    public static int recus(int n)
    {

        if(n==0||n==1)
        {
            return 1;
        }
       
        int fact1=recus(n-1);
        int fact2=n*fact1;
        return fact2;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number for  Factorial of it");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int result= recus(n);
       System.out.println("The  Factorial is: "+result);

        
    }
    
}
