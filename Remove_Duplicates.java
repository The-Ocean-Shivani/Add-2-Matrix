class Remove_Duplicates{
    //remove dupicate from string like abbcccddaa==abcd onlyyy....

    public static void remo_dupli(String str,int idx,String newstring, boolean[]map)
    {
        if(idx==str.length())
        {
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar -'a']==true)
        {
            remo_dupli(str, idx+1, newstring,map);
        }
        else{
            newstring +=currchar;
            map[currchar -'a']=true;
            remo_dupli(str, idx+1, newstring,map);
        }
    }
    public static void main(String[] args) {
        String str="abbccddda";
       boolean map[]=new boolean[26];
        remo_dupli(str,0," ",map);

    }
}
