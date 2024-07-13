public class Recursion2 {
    //print num from 1to5
    public static void printnum(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.print(n);
        printnum(n+1);
    }
    public static void main(String[] args) {
        
        int n=1;
        System.out.println("the number is: "+n);
        printnum(n);
    }
}
