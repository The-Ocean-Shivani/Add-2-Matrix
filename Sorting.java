import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of Array num: ");
        int elements=sc.nextInt();
        int arr[]=new int[elements];//dynamic input
        System.out.println("Enter Arrays number");

        //input
        for (int i=0;i<elements;i++)
        {
            arr[i]=sc.nextInt();
        }

        //output
        System.out.println("Array is: ");
        for(int i=0;i<elements;i++)
        {
          
            System.out.println(arr[i]);
        }

        //sorting
        System.out.println("The Sortng array is:  ");
        for(int i=0;i<=elements;i++)
        {
            for(int j=i+1;j<elements;j++)
            {
            int temp=0;
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
            System.out.println(arr[i]);
        }

    }
    
}
