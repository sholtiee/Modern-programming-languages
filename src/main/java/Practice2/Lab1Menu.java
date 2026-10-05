package Practice2;

import java.util.Scanner;

public class Lab1Menu {

    static final double C = 299_792_458;

    // Вывод главного меню
    static void printMenu() {
        System.out.println();
        System.out.println("Главное меню");
        System.out.println("1 - выполнить расчёт");
        System.out.println("2 - информация о программе");
        System.out.println("3 - информация о разработчике");
        System.out.println("0 - выход");
        System.out.print("Выберите пункт: ");
    }

    // Чтение пункта меню
    static Integer readMenuChoice(Scanner scanner) {
        while (true) {
            if (!scanner.hasNextLine()) {
                return null;
            }
            String line = scanner.nextLine().trim();
            try {
                int choice = Integer.parseInt(line);
                if (choice >= 0 && choice <= 3) {
                    return choice;
                }
            } catch (NumberFormatException ex) {
                // неверный ввод, просим ещё раз
            }
            System.out.print("Неверный пункт меню, повторите ввод: ");
        }
    }

    // Ввод массы с проверкой, возвращает null при вводе "выход"
    static Double readMass(Scanner scanner) {
        System.out.print("Введите m (кг) или \"выход\" для возврата в меню: ");
        while (true) {
            if (!scanner.hasNextLine()) {
                return null;
            }
            String line = scanner.nextLine().trim().replace(',', '.');
            if (line.equalsIgnoreCase("выход")) {
                return null;
            }
            try {
                double m = Double.parseDouble(line);
                if (m < 0) {
                    System.out.print("Масса не может быть отрицательной, повторите ввод: ");
                } else if (Double.isNaN(m) || Double.isInfinite(m)) {
                    System.out.print("Некорректное число, повторите ввод: ");
                } else {
                    return m;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Введено не число, повторите ввод: ");
            }
        }
    }

    // Расчёт энергии по формуле E = m * c^2
    static double calculate(double m) {
        return m * C * C;
    }

    static void printResult(double energy) {
        System.out.printf("E = %.2f Дж%n", energy);
    }

    static void printAbout() {
        System.out.println("Программа вычисляет энергию покоя по формуле E = m * c^2.");
    }

    static void printDeveloper() {
        System.out.println("Разработчик: Вальтер Михаил Сергеевич, УрФУ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            printMenu();
            Integer choice = readMenuChoice(scanner);
            if (choice == null) {
                break;
            }
            switch (choice) {
                case 1:
                    Double m = readMass(scanner);
                    if (m != null) {
                        printResult(calculate(m));
                    }
                    break;
                case 2:
                    printAbout();
                    break;
                case 3:
                    printDeveloper();
                    break;
                default:
                    running = false;
            }
        }
        System.out.println("Работа завершена.");
    }
}
