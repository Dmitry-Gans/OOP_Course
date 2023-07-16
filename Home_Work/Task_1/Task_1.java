package Home_Work.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        // cat1.setNameAndAge("Барсик", 5);
        // cat2.setNameAndAge("Рыжик", 10);
        // cat3.setNameAndAge("Филя", 3);

        // System.out.println(cat1.getNameAndAge());
        // System.out.println(cat2.getNameAndAge());
        // System.out.println(cat3.getNameAndAge());

        System.out.println(cat1.greet("Барсик", 5, "Дмитрий"));
        System.out.println(cat2.greet("Рыжик", 10, "Петр"));
        System.out.println(cat3.greet("Филя", 3, "Валерия"));

    }
    
}
