public class Task1_2 {

    public static class MyGenericsClass<T, V, K> {
        // Три переменные типа (T, V, K)
        private T firstParameter;
        private V secondParameter;
        private K thirdParameter;

        // Конструктор, принимающий на вход параметры типа (T, V, K)
        public MyGenericsClass(T firstParameter, V secondParameter, K thirdParameter) {
            this.firstParameter = firstParameter;
            this.secondParameter = secondParameter;
            this.thirdParameter = thirdParameter;
        }

        // Getter'ы (методы возвращающие значения трёх переменных)
        public T getFirstParameter() {
            return firstParameter;
        }

        public V getSecondParameter() {
            return secondParameter;
        }

        public K getThirdParameter() {
            return thirdParameter;
        }

        // Метод, выводящий на консоль имена классов для трех переменных класса
        public void printClassNames() {
            System.out.println("Имя класса первого параметра: " + firstParameter.getClass().getName());
            System.out.println("Имя класса второго параметра: " + secondParameter.getClass().getName());
            System.out.println("Имя класса третьего параметра: " + thirdParameter.getClass().getName());
        }
    }

    public static void main(String[] args) {
        // Создаём экземпляр обобщенного класса с конкретными типами (String, Integer, Double)
        MyGenericsClass<String, Integer, Double> myObject = new MyGenericsClass<>("Hello", 50, 2.5);

        // Получаем значения параметров
        System.out.println("Первый параметр: " + myObject.getFirstParameter());
        System.out.println("Второй параметр: " + myObject.getSecondParameter());
        System.out.println("Третий параметр: " + myObject.getThirdParameter());

        // Получаем имена классов параметров
        myObject.printClassNames();
    }
}