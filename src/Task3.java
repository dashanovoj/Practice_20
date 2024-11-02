import java.util.Comparator;
import java.util.Scanner;

public class Task3 {

    public static class MinMax<T extends Comparable<T>> {
        // Поле данных - массив, в котором будем находить минимальный и максимальный элементы
        private T[] array;

        // Конструктор (передаём в него массив)
        public MinMax(T[] array) {
            this.array = array;
        }

        // Метод для нахождения минимального элемента в массиве
        public T findMin() {
            // Если массив пуст или не был создан
            if (array.length == 0 || array == null) {
                throw new IllegalArgumentException("Массив не был инициализирован или пуст");
            }
            T min = array[0]; // принимаем за минимум первый элемент массива
            for (T element: array) { // проходимся по массиву
                // Через метод compareTo класса Comparble сравниваем текущий и минимальный элементы
                if (element.compareTo(min) < 0) { // если текущий элемент меньше минимального
                    min = element; // минимальным элементом устанавливаем текущий
                }
            }
            return min;
        }

        // Метод для нахождения максимального элемента в массиве
        public T findMax() {
            // Если массив пуст или не был создан
            if (array.length == 0 || array == null) {
                throw new IllegalArgumentException("Массив не был инициализирован или пуст");
            }
            T max = array[0]; // принимаем за максимум первый элемент массива
            for (T element : array) { // проходимся по массиву
                // Через метод compareTo класса Comparble сравниваем текущий и максимальный элементы
                if (element.compareTo(max) > 0) { // если текущий элемент больше максимального
                    max = element; // максимальным элементом устанавливаем текущий
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int size = sc.nextInt();

        Integer[] intArray = new Integer[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        // Создаём экземпляр класса, передаём в него массив, в котором будем искать минимальный и максимальный элементы
        MinMax<Integer> minmax = new MinMax<>(intArray);
        System.out.println("Минимальный элемент массива: " + minmax.findMin());
        System.out.println("Максимальный элемент массива: " + minmax.findMax());
    }

}
