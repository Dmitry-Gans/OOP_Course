package Seminar_1;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1.5, 2.1, "Черный");
        Triangle t2 = new Triangle(1.3, 2.5, "Белый");

        ToShape t3 = new ToShape(1.1, 1.2);

        ToShape t4 = new Triangle(1.1, "Желтый");

        // t1.setHeight(1.5);
        // t1.setWidth(2.1);
        // t1.style = "Черный";

        // t2.setHeight(1.3);
        // t2.setWidth(2.5);
        // t2.style = "Белый";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.printf("Площадь: %.2f", t1.area());
        System.out.println("\n");

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.printf("Площадь: %.2f ",t2.area());
    }
}
