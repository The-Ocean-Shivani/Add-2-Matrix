public class AddMatrix {
    public static void main(String[] args) {
        // int i,j;
        int mat1[][]={{1,2,3},
                      {4,5,6}};

        int mat2[][]={{12,3,5},
                      {54,23,1}};
        int result[][]={{0,0,0},
                        {0,0,0}};
                      for(int i=0;i<mat1.length;i++)//for row itretion
                      {
                        for(int j=0;j<mat1[i].length;j++)//for colum iteration
                        {
                            result[i][j]= mat1[i][j] + mat2[i][j];
                            System.out.print(result[i][j]+" ");
                        }
                        System.out.println(" ");
                       
                      }
                   
                    
    }
    
}
