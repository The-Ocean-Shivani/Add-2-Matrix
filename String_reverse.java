public class String_reverse {
    //string reverse like shivani to inavihs
    public static void string_rev(String str,int idx)
    {
        if(idx==0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        string_rev(str, idx-1);
    }
    public static void main(String[] args)
    {
     String str="Shivani";
     string_rev(str, str.length()-1);
        
    }
    
}
