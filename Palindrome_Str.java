public class Palindrome_Str {
    public static void main(String[] args) {
        
        String str="abba";
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("the string is not palindrome");
            }
            i++;
            j--;
        }
        System.out.println("This string is palimdrome");
    }
    
}
