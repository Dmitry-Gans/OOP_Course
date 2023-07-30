package Seminar_6.Princip2_1;

// Решение через интерфейс, второй принцип выполняется

public class Main {
    public static void main(String[] args) {
        AnimalSoundManager soundManager = new AnimalSoundManager();
        IMakeSoun dog = new Dog("Buddy");
        IMakeSoun cat = new Cat("Whiskers");
        IMakeSoun bird = new Bird("Polly");
        
        soundManager.playAnimalSound(dog); // Вывод: Woof!
        soundManager.playAnimalSound(cat); // Вывод: Meow!
        soundManager.playAnimalSound(bird); // Вывод: Chirp!
    }
}

interface IMakeSoun {
    void makeSound();
}

class Dog implements IMakeSoun {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements IMakeSoun {
    private String name;
    
    public Cat(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird implements IMakeSoun {
    private String name;
    
    public Bird(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

class AnimalSoundManager {
    public void playAnimalSound(IMakeSoun animal) {
        animal.makeSound();
    }
}

















