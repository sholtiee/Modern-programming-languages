package Practice2;

public class Task4 {

    // Расстояние между двумя точками на плоскости
    static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        System.out.printf("Расстояние между (0; 0) и (3; 4) = %.2f%n", distance(0, 0, 3, 4));
    }
}
