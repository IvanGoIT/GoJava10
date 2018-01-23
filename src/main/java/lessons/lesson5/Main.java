package lessons.lesson5;

public class Main {

    static void classObjectsExample() {
        Car car1 = new Car("my car", 100);
        car1.show();

        Car car2 = new Car("77777r", 1200);
        car2.show();

        Car car3 = new Car("22222", 10440);
        car3.show();

        Car car4 = new Car("my  car");
    }

    static void constructorsExample() {
        Car car1 = new Car("111");
        Car car2 = new Car("222", 1000);
        Car car3 = new Car();

        car1.show();
        car2.show();
        car3.show();
    }

    static void staticExample() {
        // Car.sayHello();

        System.out.println("lastName = " + Car.lastName);
        Car car1 = new Car();
        System.out.println("lastName = " + Car.lastName);

        Car car2 = new Car("super car");
        System.out.println("lastName = " + Car.lastName);

        Car car3 = new Car("my favorite car");
        System.out.println("lastName = " + Car.lastName);

        // car.show();
        // Car.sayHello();

        System.out.println("lastName = " + Car.lastName);
        System.out.println("lastName = " + Car.lastName);
        System.out.println("lastName = " + Car.lastName);
    }

    public static void main(String[] args) {
        // classObjectsExample();
        // constructorsExample();
        // staticExample();

        Car car = new Car("HotWheel");
        car.wheels[0] = new Wheel("Italy");
        car.wheels[0].setPrice(10000);
        car.show();
    }
}
