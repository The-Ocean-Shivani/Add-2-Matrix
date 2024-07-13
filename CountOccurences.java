public class CountOccurences {

    public static int retr(int arr[],int n,int x)
    {int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
       
    }
    public static void main(String[] args) {

        int arr[]={12,5,3,7,97,81,34 ,3,6,23,83,73,25,3,4777,3,57};
        int x=3;
        int n=arr.length;
System.out.println(retr(arr,n,x));
    }
    
}
