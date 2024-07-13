// public class MAXMIN {
//     public static int  minmax(int arr[],int n){
//        int  min= arr[0];
//        int max=arr[0];
//         for(int i=0;i<n;i++)
//         {
 
//             if(arr[i]>max)
//             {
//                 max=arr[i];
//               //  return max;
//             }
//             else{

//                 if(arr[i]<min)
//                 min=arr[i];
//                // return min;
//             }
//         }
//         int mxmn[]={max,min};
//         return mxmn;
    

//     }
//     public static void main(String[] args) {
//         int arr[]={1,423,6,46,34,23,13,53,4};
//         int n=arr.length;
//         System.out.println("the value max and min is : "+minmax(arr,n));

        
//     }
    
// }
public class MAXMIN {
    public static int[] minmax(int arr[], int n) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                if (arr[i] < min)
                    min = arr[i];
            }
        }
        int mxmn[] = { max, min };
        return mxmn;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 245,423, 6, 46, 34, 23, 13, 53, 4 };
        int n = arr.length;
        int result[] = minmax(arr, n);
        System.out.println("The maximum value is: " + result[0]);
        System.out.println("The minimum value is: " + result[1]);
    }
}
