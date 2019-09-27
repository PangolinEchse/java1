package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        ArrayList<Integer> number = new ArrayList<Integer>();
        int[][] matrix = new int[row][column];
        MakeRandomMatrix.makeMatrix(matrix);
        PrintMatrix.printMatrix(matrix);
        for (int i = 0; i < MonotoneColumn.monotoneNumber(matrix,number).size(); i++) {
        System.out.println(number.get(i));
            }}
    }


