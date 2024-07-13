class Array1{
//Find a peak element which is not smaller than its neighbours

public static int findpeak(int arr[],int n)
{
    for (int i=1;i<n-1;i++)
    {
         // First or last element is peak element
         if (n == 1)
         return 0;
     if (arr[0] >= arr[1])
         return 0;
     if (arr[n - 1] >= arr[n - 2])
         return n - 1;
        if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
        {
            return i;
        }
    }
    return 0;
}
public static void main(String args[])
{
int  arr[]={1,4};
//int arr[]={1,3,20,4,1,0};
int n=arr.length;
System.out.println("the result  of peak value is: "+findpeak(arr, n));
}
}