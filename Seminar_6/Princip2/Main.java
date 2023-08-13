package Seminar_6.Princip2;

// Принцип открытости/закрытости (OCP).
// Соответствует букве O акронима SOLID. Принцип можно выразить 
// так: «Классы, методы или функции должны быть открыты для 
// расширения (добавления новой функциональности) и закрыты для 
// модификации». Такой подход запрещает кому-либо изменять уже 
// опробованный и протестированный код, а значит, он не ломается. 
// В этом и состоит основное преимущество такого подхода.

// Решение через класс, но второй принцип не выполняется

public class Main {
    public static void main(String[] args) {
        AnimalSoundManager soundManager = new AnimalSoundManager();
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        
        soundManager.playAnimalSound(dog); // Вывод: Woof!
        soundManager.playAnimalSound(cat); // Вывод: Meow!
    }
}

class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void makeSound() {
        System.out.println("Unknown sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalSoundManager {
    public void playAnimalSound(Animal animal) {
        animal.makeSound();
    }
}

