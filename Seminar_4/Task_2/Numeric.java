package Seminar_4.Task_2;
// Попытка сосздать неудачный вариант

// public class Numeric<T extends Number> { // Ограничение типа, через наследование

//     T num;

//     public Numeric(T n) {
//         num = n;
//     }

//     public double reciprocal() {
//         return 1 / num.doubleValue(); // doubleValue - возвращает число в дробном виде
//     }

//     public double fraction() { // Вернуть дробную часть
//         return num.doubleValue() - num.intValue();
//     }
// }

public class Numeric<T extends Number> {
    
    T num;

    public Numeric(T n) {
        num = n;
    }

    public double reciprocal() {

        return 1 / num.doubleValue();

    } 

    public double fraction() {
        return num.doubleValue() - num.intValue();
    }
}
