package Practice1;

public class task3VAR6 {

    public static int[] process(int a, int b) {
        if (a != b) {
            a += b;
            b = a;
        } else {
            a = 0;
            b = 0;
        }
        return new int[] { a, b };
    }

    public static void main(String[] args) {
        int A = 67;
        int B = 52;

        int[] result = process(A, B);

        System.out.printf("A: %d%nB: %d%n", result[0], result[1]);
    }
}
