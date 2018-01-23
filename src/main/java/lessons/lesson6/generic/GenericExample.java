package lessons.lesson6.generic;

import lessons.lesson5.Car;
import lessons.lesson5_3.polymorphism.animals.Cat;

public class GenericExample {
    public static void main(String[] args) {
        Dog<Cat> dog1 = new Dog<>();
        dog1.obj = new Cat();

        Dog<Car> dog2 = new Dog<>();
        dog2.obj = new Car();

        dog2.getObj();
        dog1.getObj();
    }
}
