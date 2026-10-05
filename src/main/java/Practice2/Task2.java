package Practice2;

public class Task2 {

    // Сумма A + A^2 + ... + A^N за один цикл
    public static double sum(double a, int n) {
        double term = 1;
        double result = 0;
        for (int i = 1; i <= n; i++) {
            term *= a; // следующий член получаем из предыдущего
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        double a = 2;
        int n = 5;
        System.out.printf("A = %.1f, N = %d, сумма = %.2f%n", a, n, sum(a, n));
    }
}
