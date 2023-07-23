package Seminar_3.Task_2;

public class Task_2 {
    public static void main(String[] args) {
        ISomeTest<Integer> iSomeTest = (n, m) -> n > m;
        System.out.println(iSomeTest.test(5, 6));

        ISomeTest<Double> iSomeTest2 = (n, m) -> n > m;
        System.out.println(iSomeTest2.test(6.0, 1.0));
    }

}
