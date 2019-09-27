package com.company;
import java.util.ArrayList;
class MonotoneColumn {
   static   ArrayList<Integer>  monotoneNumber(int[][] matrix,ArrayList number){
       int row=matrix.length;
       int column=matrix[0].length;
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
