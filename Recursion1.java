public class Recursion1 {
//Ans: 5,4,3,2,1
    public static void printNum(int n)//recurs func
    {
        if(n==0)
        {
            return ;
        }
        System.out.print(n);
        printNum(n-1);
       
       
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The number is: "+n);
        printNum(n);

        
    }
    
}
