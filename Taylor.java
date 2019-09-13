class Taylor {
    static double taylorResult(double x, double k) {
        double sum = 1;
        int iter = 1;
        double nextTerm = 1;

        if (x < 1 && x > -1) {
            double e = Math.pow(10, -1 * k);
            while (Math.abs(nextTerm) > e) {
                double m = -0.5;
                nextTerm = nextTerm * x * (m - iter + 1) / iter;
                sum += nextTerm;
                iter++;
            }
        } else {
            System.out.println("Wrong input !");
        }
        return sum;
    }
}

