package Seminar_2;

public class Task_1 {

    public static void main(String[] args) {
        
        // Test_1 t1 = new Test_1();
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Следующее значение: " + t1.getNext());
        // }
        // System.out.println("Cброс: ");
        // t1.reset();
        // System.out.println("Начальное значение: 100");
        // t1.setNum(100);
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Следующее значение: " + t1.getNext());
        // }

        Test_2 t1 = new Test_2();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + t1.getNext());
        }
        System.out.println("Cброс: ");
        t1.reset();
        System.out.println("Начальное значение: 100");
        t1.setNum(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + t1.getNext());
        }
    }
    
}
