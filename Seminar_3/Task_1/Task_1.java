package Seminar_3.Task_1;

public class Task_1 {

    public static void main(String[] args) {
        IValue value;
        value = () -> 98.6; // Назначаем функции лямбда выражения: () - значение, -> - return
        // Лямбда это реализации функционального интерфейса, это когда есть один метод
        System.out.println(value.getValue());

        IValue_2 value_2 = (x) -> 100.0 / x;
        IValue_2 value_2_1 = (y) -> 24.0 * y - 5.5;
        System.out.println(value_2.getValue(5.0));
        System.out.println(value_2_1.getValue(8.0));

        IValue_3 value_3 = (x, y) -> {
            double result = 1.0;
            // Реализация
            // Реализация
            // Реализация
            return result;
        };
    }

}
 