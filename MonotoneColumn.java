import java.util.ArrayList;
public class MonotoneColumn {
   static   ArrayList<Integer>  monotoneNumber(int[][] matrix,int row, int column){
        //int[] number={};
       ArrayList<Integer> number = new ArrayList<Integer>();
        //int iter=0;
       for (int i = 0; i < column; i++) {
           int j =1;
           while (j!=row && matrix[j-1][i]>=matrix[j][i] ){

               j++;
       }
           if (j==row ){
               number.add(i);
           }
            j =1;
           while (j!=row && matrix[j-1][i]<=matrix[j][i] ){

               j++;
           }
           if (j==row ){
               number.add(i);
           } }

           return number;

    }
}
