package Practice2;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("  x, град | tg(x)");
        // перебираем углы от 0 до 90 градусов с шагом 5
        for (int x = 0; x <= 90; x += 5) {
            if (x == 90) {
                // тангенс 90 градусов не существует
                System.out.printf("%8d | не определён%n", x);
            } else {
                System.out.printf("%8d | %.4f%n", x, Math.tan(Math.toRadians(x)));
            }
        }
    }
}
