public class printnumwioutnum {
    //Print 1 to n without using loops
    public static void priNum(int n){
    if(n>0)
  {
      priNum(n-1);
      System.out.println(n+" ");

    }
    }
    public static void main(String[] args) {
        int n=9;
      priNum(n);

       
    }
    
}
