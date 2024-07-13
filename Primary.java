public class Primary {
    //Q1 Logical Programming Question in java for Primary number to find 1 to 10


    public static void main(String[] args) {
    

        int num=10;

        for(int i=0;i<=num;i++)
        {
            if(num%2==0 && num%i==0)
            {
                System.out.println("pri");
                System.out.println(i+" ");
            }
            else{
                System.out.println("no pri");
            }
        }

        
    }
    
}
