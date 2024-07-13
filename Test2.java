
public class Test2 {

  
public static void main(String[] args) {
    //1,423,6,46,34,23,13,53,4

    int arr[]={1,423,6,46,34,23,13,53,4};
   int n=arr.length;
   
   int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
    
            else if(arr[i]<min)
            {
                min=arr[i];
            }
        }
   System.out.println("max is: "+max);
   System.out.println("Min is:"+min);

    
}}