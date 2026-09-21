package Practice1;

import java.util.Scanner;

public class task2VAR6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите х");
        double x = scanner.nextDouble();
        double y = Math.log(2*x) + Math.pow(Math.log10(x), 3) + Math.sqrt(5*x);

        System.out.printf("y = %f%n", y);
    }
}
