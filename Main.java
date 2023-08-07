import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = getFloatValueFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatValueFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number;
        while (true) {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                break;
            } else {
                System.out.println("Ошибка! Введено некорректное значение.");
                scanner.next(); // считывание некорректного значения, чтобы избежать зацикливания
            }
        }
        return number;
    }
}