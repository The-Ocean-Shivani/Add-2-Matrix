public class BinarySear {
    int binearsearch(int arr[],int l,int r,int x)
    {
        if(r>=l)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            if(arr[mid]>x)
            {
                return binearsearch(arr, l, mid-1, x);
            }
            if (arr[mid]<x)
            {
            return binearsearch(arr, mid+1, r, x);
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,23,44,56,78,93,99};
        int n=arr.length;
        int x=56;
        BinarySear ob=new BinarySear();
        int result=ob.binearsearch(arr, 0,n-1, x);
        if(result==-1)
        {
System.out.println("Elemnt is not founde");
        }
       else{
        System.out.println("Element is found at index: "+result);
       }
    }
    
}
