import java.util.Scanner;
//How to find the maximum and minimum value in array
public class MaxMin2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int element=sc.nextInt();
        int arr[]=new int[element];
        System.out.println("int Arrays elements");
        for(int i=0;i<element;i++)
        {
           
            arr[i]=sc.nextInt();
           

        }
        int max=arr[0];
            int min=arr[0];

        for(int i=0;i<element;i++)
        { 
            
            if(arr[i]>max)

            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
      
        }
        System.out.println("Min"+min);
        System.out.println("Max"+max);
      
   
        

    }
    
}
