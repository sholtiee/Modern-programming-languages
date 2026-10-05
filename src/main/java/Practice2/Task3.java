package Practice2;

public class Task3 {

    // Ищет первый номер K, для которого |AK - A(K-1)| < eps, и выводит результат
    public static void findK(double eps) {
        double prev = 1; // A1
        double cur = 2;  // A2
        int k = 2;
        while (Math.abs(cur - prev) >= eps) {
            double next = (prev + 2 * cur) / 3;
            prev = cur;
            cur = next;
            k++;
        }
        System.out.printf("K = %d%nA(K-1) = %.6f%nAK = %.6f%n", k, prev, cur);
    }

    public static void main(String[] args) {
        double eps = 0.001;
        System.out.println("eps = " + eps);
        findK(eps);
    }
}
