import java.util.Scanner;

public class Palidrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
            while(temp!=0)
            {
                int digit=temp%10;//extract remender
                rev=rev*10+digit;
                temp=temp/10;
            } 
            if(num==rev)
            {
                System.out.println("palidrom");
            } 
            else{
                System.out.println("not paledrom");
            }  
    }
    
}
