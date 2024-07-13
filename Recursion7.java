
public class Recursion7 {
    //power answer 2^5=32jjj
    static int x = 2, n = 5;

    public static int calpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int calpnm1=calpow(x, n-1);
      int calpmul=x*calpnm1;
      return calpmul;

    }

    public static void main(String[] args) {
int result=calpow(x, n);
System.out.println(result);

    }

}

