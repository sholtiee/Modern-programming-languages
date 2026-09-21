package Practice1;

import java.util.Scanner;

public class task4VAR6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m;

        System.out.printf("Программа вычисляет E=mc^2%nВведите m: ");
        
        if (scanner.hasNextDouble()) {
            m = scanner.nextDouble();
        } else {
            System.out.println("Введены невалидные данные, необходимо ввести число.");
            return;
        }

        double c = 299_792_458;
        double E = m * Math.pow(c, 2);

        System.out.printf("E = %.2f%n", E);
    }
}
