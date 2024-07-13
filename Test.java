public class Test {
    public static void main(String[] args) {
        
        Object[] myArray = new Object[4]; 
myArray[0] = true; 
myArray[1] = 42; 
myArray[2] = 3.14; 
myArray[3] = "Hello, World!"; 
for(int i=0;i<myArray.length;i++)
{
    System.out.println(myArray[i]);    

}
    }
}
