package Home_Work.Task_2;

public class Task_2 {
    public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(3, 5);

    r1.setWidth(5);
    r1.setHeight(4);

    r1.show();
    r2.show();
    System.out.println();

    System.out.println("Площадь прямоугольника r1: " + r1.calculateArea());
    System.out.println("Площадь прямоугольника r2: " + r2.calculateArea());
    System.out.println();

    System.out.println("Площадь прямоугольника r1: " + r1.calculatePerimeter());
    System.out.println("Площадь прямоугольника r2: " + r2.calculatePerimeter());
    

    }
}
