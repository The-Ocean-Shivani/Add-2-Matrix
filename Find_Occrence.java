public class Find_Occrence {
    static int first=-1;
    static int last=-1;
    public static void findelement(String str,int idx,char element)
    {
        if(idx == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;

        }
      char curr_ele = str.charAt(idx);
      if(curr_ele==element)
      {
       if(first==-1)
       {
        first=idx;
       }
       else
       {
        last=idx;
       }
      }
      findelement( str, idx +1, element);

    }

    public static void main(String[] args) {
        String str="afdgfgtgv";
   findelement(str, 0, 'g');

    }
    
}
