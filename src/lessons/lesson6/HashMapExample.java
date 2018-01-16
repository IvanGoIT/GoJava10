package lessons.lesson6;

import questions.question5.entities.Dog;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Dog> dogs = new HashMap<>();

        dogs.put("dog1", new Dog("dog1", 5));
        dogs.put("dog2", new Dog("dog2", 1));
        dogs.put("dog3", new Dog("dog3", 4));

        Dog dog = dogs.get("dog3");
        System.out.println(dog.getAge());

        dog = dogs.get("000");
        if (dog != null) {
            System.out.println(dog.getAge());
        }
    }
}
