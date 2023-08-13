package Seminar_6.Princip5;

// Принцип инверсии зависимостей.
// Модули верхних уровней не должны зависеть от модулей нижних уровней. 
// Если по простому, то нужно делать код так, что-бы этот код имел как 
// можно меньше зависимостей и не было круговых зависимостей, например 
// модуль A зависит от модуля B, а модуль B зависит от модуля A.

// Принцип инверсии зависимости

class Dog {
    public void bark() {
        System.out.println("Dog barks.");
    }
}

class DogOwner {
    private Dog dog;

    public DogOwner() {
        this.dog = new Dog();
    }

    public void makeDogBark() {
        dog.bark();
    }
}

public class Main {
    public static void main(String[] args) {
        DogOwner dogOwner = new DogOwner();
        dogOwner.makeDogBark(); // Вывод: Dog barks.
    }
}