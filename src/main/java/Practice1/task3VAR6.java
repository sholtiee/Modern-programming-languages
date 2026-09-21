package Practice1;

public class task3VAR6 {
    public static void main(String[] args) {
        int A = 67;
        int B = 52;

        if (A != B) {
            A += B;
            B = A;
        } else {
            A = 0;
            B = 0;
        }

        System.out.printf("A: %d%nB: %d%n", A, B);
    }
}
