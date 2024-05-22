import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення границ проміжку
        System.out.print("Введіть початкову границю проміжку: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінцеву границю проміжку: ");
        double end = scanner.nextDouble();

        // Початкове значення аргумента функції
        double step = 0.1;
        int count = 0;

        // Цикл протабулювання функції та підрахунку кількості значень в діапазоні
        for (double x = 0; x <= 2; x += step) {
            double fx = 0.1 * Math.pow(x, 2) - x * Math.cos(x);
            if (fx >= start && fx <= end) {
                count++;
            }
        }

        // Виведення результату
        if (count > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + count);
        } else {
            System.out.println("Немає значень функції у заданому діапазоні.");
        }
    }
}