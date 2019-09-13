import java.util.Scanner;

public class TaylorComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double k = input.nextDouble();
        double sumDefoult = 1 / Math.sqrt(1 + x);

        if (Taylor.taylorResult(x, k) < sumDefoult) {
            System.out.println("result is less!");
        } else {
            System.out.println("result is bigger!");
        }

        System.out.printf("%.3f\n", Taylor.taylorResult(x, k));
        System.out.printf("%.3f", sumDefoult);
    }
}
