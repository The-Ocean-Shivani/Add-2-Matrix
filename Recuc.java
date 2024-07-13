public class Recuc {
    static int ert(int n)
    {
        if(n==0)
        {
            return 0;
        }
        System.err.print(n);
        return ert(n-1);
       
    }
    public static void main(String[] args) {
       int  n=5;
        ert(n);
        
    }
}
