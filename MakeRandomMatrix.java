package com.company;
import java.util.Random;
import java.util.Scanner;
 class MakeRandomMatrix {
    static int [][] makeMatrix(int [][] matrix){
      Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rnd.nextInt(100 + 1);
            }
        }
        return matrix;
}}
