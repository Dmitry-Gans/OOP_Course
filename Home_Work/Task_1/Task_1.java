package Home_Work.Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_1 implements InterfaceMINMAX_2 {

    public static void main(String[] args) {
        Test_1 test_1 = new Test_1();
        Map<Integer,String> list = new HashMap<>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        cat1.setNameAndAge("Барсик", 5);
        cat2.setNameAndAge("Рыжик", 10);
        cat3.setNameAndAge("Филя", 3);
        cat4.setNameAndAge("Лео", 2);
        cat5.setNameAndAge("Вася", 7);

        list.put(1, cat1.getNameAndAge());
        list.put(2, cat2.getNameAndAge());
        list.put(3, cat3.getNameAndAge());
        list.put(4, cat4.getNameAndAge());
        list.put(5, cat5.getNameAndAge());
        
        System.out.println(list.get(1) + "\n" + test_1.met1() + test_1.reset());
        System.out.println(list.get(1) + "\n" + test_1.met1() + test_1.getTime());
        // System.out.println(list.get(2) + "\n" + test_1.met3() + test_1.reset());
        // System.out.println(list.get(2) + "\n" + test_1.met3() + test_1.getTime());
        // System.out.println(list.get(5) + "\n" + test_1.met2() + test_1.reset());
        // System.out.println(list.get(5) + "\n" + test_1.met2() + test_1.getTime());

        for (var item : list.entrySet()) {
            if(item.getKey() % 2 == 0){
                System.out.println(item.getKey() + ". " + item.getValue() + MAX + "\n");
            }else{
                System.out.println(item.getKey() + ". " + item.getValue() + MIN + "\n");
            }
            
        }

        // System.out.println(cat1.getNameAndAge());
        // System.out.println(cat2.getNameAndAge());
        // System.out.println(cat3.getNameAndAge());

        // System.out.println(cat1.greet("Барсик", 5, "Дмитрий"));
        // System.out.println(cat2.greet("Рыжик", 10, "Петр"));
        // System.out.println(cat3.greet("Филя", 3, "Валерия"));

    }
    
}
