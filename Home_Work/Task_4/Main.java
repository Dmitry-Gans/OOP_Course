package Home_Work.Task_4;

// Задача 1 : Напишите обобщенный метод printElement, 
// который принимает один параметр типа T и выводит его на консоль.
// В этом примере мы объявляем обобщенный метод printElement, 
// который принимает один параметр типа T. Мы просто выводим этот 
// элемент на консоль с помощью метода System.out.println().
// В методе main мы вызываем printElement с различными типами 
// данных: целое число (Integer), строку (String) и число с плавающей 
// запятой (Double). Компилятор автоматически выводит тип параметра T 
// на основе переданных аргументов.
// Таким образом, обобщенные методы позволяют нам писать код, 
// который может работать с различными типами данных, обеспечивая 
// простоту и гибкость использования.

// Задача 2 : Напишите обобщенный метод printArray, который принимает
// массив любого типа и выводит его элементы на консоль.
// В этом примере мы объявляем обобщенный метод printArray, 
// который принимает массив типа T. Затем мы используем цикл for-each, 
// чтобы пройти по всем элементам массива и вывести их на консоль.
// В методе main мы создаем массивы типов Integer и String и вызываем 
// printArray для каждого из них. В результате мы получаем вывод на 
// консоль элементов каждого массива.
// Таким образом, обобщенные методы позволяют нам создавать код, 
// который может работать с разными типами данных, обеспечивая 
// повторное использование и гибкость.

public class Main {

    public static void main(String[] args) {
        // Для первой задача
        printElement<Integer> element1 = new printElement<Integer>(15);
        printElement<String> element2 = new printElement<String>("Проверка");
        printElement<Double> element3 = new printElement<Double>(5.2);
        
        // Для второй задача
        Integer[] intArray = {2, 4, 6, 2};
        String[] strArray = {"Hi", "Hello", "Nice"};
        Double[] doubleArray = {1.3, 4.2, 2.6};

        // Для первой задача
        System.out.println("Первая задача: ");
        element1.showType();
        element2.showType();
        element3.showType();
        
        int a = element1.getType();
        String b = element2.getType();
        double c = element3.getType();
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        // Для второй задача
        System.out.println("Вторая задача: ");
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);

    }
    public static <T> void printArray(T[] array) {
        System.out.println("");
        for (T i : array) {
            int length = array.length;
            System.out.print(i);
            if(length != 0) {
                System.out.print(", ");
                length --;
            }
        }
        System.out.println("");
    }

}
