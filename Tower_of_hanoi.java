public class Tower_of_hanoi {
    public static void towerOH(int n,String src, String helper,String destiny)
    {
        if(n==1)
        {
            System.out.println("the disk no. "+n+" move "+src+" to "+destiny);
            return; 
        }
        towerOH(n-1, src, destiny, helper);
        System.out.println("the disk no. "+n+" move "+src+" to "+destiny);
        towerOH(n-1, helper, src, destiny);
    }
    public static void main(String[] args) {

        int n=9;
        towerOH(n, "S", "H", "D");

        
    }
}
