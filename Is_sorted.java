public class Is_sorted {
    
    static boolean isSort(int arr[],int idx)
    {
        if(idx == arr.length-1)
        {
            return true;
        }
    if(arr[idx]<arr[idx+1])
    {
        return isSort(arr, idx+1);
    }
    else{
        return false;
    }}
    public static void main(String[] args) {
        int arr[]={1,2,34,55};
       System.out.println( isSort(arr, 0));
        
    }
}
