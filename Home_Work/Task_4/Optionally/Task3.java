package Home_Work.Task_4.Optionally;

// Задача 3 :Напишите обобщенную функцию getMax, которая принимает
// два параметра типа T и возвращает максимальное значение из них.
// В этом примере мы объявляем обобщенную функцию getMax, которая 
// принимает два параметра типа T, ограниченных интерфейсом Comparable.
// Мы используем метод compareTo для сравнения значений и возвращаем 
// максимальное значение из двух.
// В методе main мы вызываем getMax с разными типами данных: 
// целое число (Integer), число с плавающей запятой (Double) и 
// строку (String). В результате мы получаем максимальные значения 
// из каждой пары и выводим их на консоль.
// Обобщения позволяют нам писать универсальный код, который может 
// работать с разными типами данных, сохраняя при этом безопасность типов.

public class Task3 {

    public static void main(String[] args) {

        System.out.println(getMax(13, 5));
        System.out.println(getMax("Привет", "Пока"));
        System.out.println(getMax(25.6, 2.8));
        
    }

    public static <T extends Comparable<T>> T getMax(T object1, T object2) {
        return object1.compareTo(object2) >= 0 ? object1 : object2;
    }
    
}
