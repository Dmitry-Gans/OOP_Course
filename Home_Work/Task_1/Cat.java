package Home_Work.Task_1;

import java.util.ArrayList;

public class Cat extends Owner{
    
    private String name;
    private int age;

    public void setNameAndAge(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getNameAndAge(){
        return "Котик: " + name + ", Возраст: " + age;
    }

    public String greet(String nameA, int age, String nameB){

        super.name = nameB;
        name = nameA;
        return "Мяу! Меня зовут " + this.name + ". Мне " + age + " года(лет)." +
        " Мой владелец - " + super.name;
    }
}

class Owner{
    
    protected String name;
    
    public String nameOwner(String name){
        this.name = name;
        return name;
    }
    
}
