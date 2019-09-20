import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = rnd.nextInt(100 - 0 + 1);

            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
    }}
        System.out.println("");
        for (int i = 0; i < MonotoneColumn.monotoneNumber(matrix,row,column).size(); i++) {
        System.out.println(MonotoneColumn.monotoneNumber(matrix,row,column).get(i));
            }}
    }


