package lessons.lesson5_3.polymorphism;

import lessons.lesson5_3.polymorphism.animals.Animal;
import lessons.lesson5_3.polymorphism.animals.Cat;
import lessons.lesson5_3.polymorphism.animals.Creature;
import lessons.lesson5_3.polymorphism.animals.Dog;

public class Main {

    static void example1() {
        float c1 = 10.5f;

        int a1 = (int) c1;
        c1 = (float) a1;
        System.out.println(c1);


        Cat cat1 = new Cat();
        cat1.kitty = "123";

        Animal animal1 = cat1;
        // animal1.kitty = "";

        Cat cat = (Cat) animal1;
        System.out.println(cat.kitty);

        Creature creature1 = animal1;
        cat = (Cat) creature1;
        System.out.println(cat.kitty);
    }

    static void example2() {
        Animal[] animalsInZoo = { new Cat(), new Dog(), new Cat(), new Dog() };

        for (Animal animal: animalsInZoo) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.kitty);
            }
        }
    }

    static void example3() {
        Cat cat = new Cat();
        if (cat instanceof Cat) {
            System.out.println("cat is object of class Cat");
        }
        if (cat instanceof Animal) {
            System.out.println("cat is object of class Animal");
        }
        if (cat instanceof Creature) {
            System.out.println("cat is object of class Creature");
        }
        // ---------------------------------------
        if (cat.getClass().getName().equals(Cat.class.getName())) {
            System.out.println("cat is true object of class Cat");
        }
        if (cat.getClass().getName().equals(Animal.class.getName())) {
            System.out.println("cat is true object of class Animal");
        }
        if (cat.getClass().getName().equals(Creature.class.getName())) {
            System.out.println("cat is true object of class Creature");
        }
    }

    public static void main(String[] args) {
        // example1();
        // example2();
        example3();
    }
}
