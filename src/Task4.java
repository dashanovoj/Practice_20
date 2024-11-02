import java.util.Scanner;

public class Task4 {

    public static class Calculator {
        public static <T extends Number, U extends Number> double sum(T a, U b) {
            return a.doubleValue() + b.doubleValue();
        }

        public static <T extends Number, U extends Number> double multiply(T a, U b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number, U extends Number> double divide(T a, U b) {
            if (b.doubleValue() == 0) {
                throw new IllegalArgumentException("Ошибка: Деление на ноль.");
            }
            return a.doubleValue() / b.doubleValue();
        }

        public static <T extends Number, U extends Number> double  subtraction(T a, U b) {
            return a.doubleValue() - b.doubleValue();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в приложение 'Калькулятор'!");
        while (true) {
            System.out.println("Выберите необходимую операцию:" +
                    "\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Выход");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Выход из калькулятора. Спасибо за использование!");
                break;
            }

            System.out.println("Введите первое число: ");
            double num1 = sc.nextDouble();

            System.out.println("Введите второе число: ");
            double num2 = sc.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = Calculator.sum(num1, num2);
                    System.out.println("Результат сложения: " + result);
                    break;
                case 2:
                    result = Calculator.subtraction(num1, num2);
                    System.out.println("Результат вычитания: " + result);
                    break;
                case 3:
                    result = Calculator.multiply(num1, num2);
                    System.out.println("Результат умножения: " + result);
                    break;
                case 4:
                    try {
                        result = Calculator.divide(num1, num2);
                        System.out.println("Результат деления: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Неверный выбор операции.");
                    break;
            }
        }
    }
}
