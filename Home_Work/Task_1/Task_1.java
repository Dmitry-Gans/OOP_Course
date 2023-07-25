package Home_Work.Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class Task_1 implements InterfaceMINMAX_2 {

    public static void main(String[] args) {
        Discount discount = (double a, double b) -> a - (a * b);
        System.out.println("У вас сработала скидка 20% \n" +
                "За лечение котика, к оплате: " + discount.getDiscount(1500, 0.20));
        // Test_1 test_1 = new Test_1();
        Map<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        cat1.setName("Барсик");
        cat1.setAge(10);
        cat2.setName("Рыжик");
        cat2.setAge(3);
        cat3.setName("Филя");
        cat3.setAge(12);
        cat4.setName("Лео");
        cat4.setAge(5);
        cat5.setName("Вася");
        cat5.setAge(8);

        map.put(cat1.getName(), cat1.getAge());
        map.put(cat2.getName(), cat2.getAge());
        map.put(cat3.getName(), cat3.getAge());
        map.put(cat4.getName(), cat4.getAge());
        map.put(cat5.getName(), cat5.getAge());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        // Если я правильно понял задание под цифрой 3
        // Collections.sort(list, new Comparator<Integer>() {
        // public int compare(Integer str, Integer str1) {
        // return (str).compareTo(str1);
        // }
        // });

        // Тоже самое но уже через лямбда
        list.sort((num1, num2) -> num1 - num2);

        for (Integer integer : list) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(integer)) {
                    sortedMap.put(entry.getKey(), integer);
                }
                
            }
            
        }
        System.out.println(sortedMap);

        // Collections.sort(list, new Comparator<String>() {
        // @Override
        // public int compare(String i1, String i2) {
        // return i1.compareTo(i2);
        // }
        // });

        // System.out.println(list.get(1) + "\n" + test_1.met1() + test_1.reset());
        // System.out.println(list.get(1) + "\n" + test_1.met1() + test_1.getTime());
        // System.out.println(list.get(2) + "\n" + test_1.met3() + test_1.reset());
        // System.out.println(list.get(2) + "\n" + test_1.met3() + test_1.getTime());
        // System.out.println(list.get(5) + "\n" + test_1.met2() + test_1.reset());
        // System.out.println(list.get(5) + "\n" + test_1.met2() + test_1.getTime());

        // for (var item : list.entrySet()) {
        // if(item.getKey() % 2 == 0){
        // System.out.println(item.getKey() + ". " + item.getValue() + MAX + "\n");
        // }else{
        // System.out.println(item.getKey() + ". " + item.getValue() + MIN + "\n");
        // }

        // }

        // System.out.println(cat1.getNameAndAge());
        // System.out.println(cat2.getNameAndAge());
        // System.out.println(cat3.getNameAndAge());

        // System.out.println(cat1.greet("Барсик", 5, "Дмитрий"));
        // System.out.println(cat2.greet("Рыжик", 10, "Петр"));
        // System.out.println(cat3.greet("Филя", 3, "Валерия"));

    }

}
