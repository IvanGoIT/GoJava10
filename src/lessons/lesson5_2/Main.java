package lessons.lesson5_2;

import lessons.lesson5_2.animals.Animal;
import lessons.lesson5_2.animals.Cat;
import lessons.lesson5_2.animals.Dog;
import lessons.lesson5_2.entities.A;
import lessons.lesson5_2.entities.B;
import lessons.lesson5_2.vehicle.Bicycle;
import lessons.lesson5_2.vehicle.Skateboard;
import lessons.lesson5_2.vehicle.car.Car;
import lessons.lesson5_2.vehicle.car.JeepCar;
import lessons.lesson5_2.vehicle.car.SuperCar;

public class Main {

    static void example1() {
        A a = new A("abc", 100);
        B b = new B("NAME", "cba", 200);

        a.show();
        System.out.println();
        b.show();
    }

    static void example2() {
        Cat cat = new Cat("Kitty", 2, ">>><<<");
        Dog dog = new Dog("Doggy", 5, 100);

        cat.sound();
        dog.sound();
    }

    static void example3() {
        Bicycle bicycle = new Bicycle(10, 10);
        Skateboard skateboard = new Skateboard(5, 2);
        Car car = new Car(100, 100);
        JeepCar jeepCar = new JeepCar(80, 120);
        SuperCar superCar = new SuperCar(100, 50);

        bicycle.move();
        skateboard.move();
        car.move();
        jeepCar.move();
        superCar.move();

        System.out.println();

        superCar.superSpeed();
        superCar.move();
    }

    public static void main(String[] args) {
        // example1();
        // example2();
        example3();
    }
}
