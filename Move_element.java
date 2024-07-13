public class Move_element {
    public static void move_string_elem(String str,int idx, int count,String newString)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char curr_ele=str.charAt(idx);
        if(curr_ele=='x')
        {
          count++;
        }
        else
        {
            newString+=curr_ele;
        }
        move_string_elem(str, idx+1, count, newString);
    }
    public static void main(String[] args) {
        String str="axfxxdhg";
        move_string_elem(str, 0, 0, " ");
        
    }
    
}
