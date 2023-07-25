package Home_Work.Task_1;

import java.util.ArrayList;

public class Cat extends Owner {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return "Котик: " + name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String greet(String nameA, int age, String nameB) {

        super.name = nameB;
        name = nameA;
        return "Мяу! Меня зовут " + this.name + ". Мне " + age + " года(лет)." +
                " Мой владелец - " + super.name;
    }
}

class Owner {

    protected String name;

    public String nameOwner(String name) {
        this.name = name;
        return name;
    }

}
