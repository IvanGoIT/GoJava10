package lessons.lesson5_2.vehicle.car;

import lessons.lesson5_2.vehicle.Vehicle;

public class Car extends Vehicle {

    public String brandName = "Porsche";

    public Car(float speed, float mass) {
        super(speed, mass);
    }

    @Override
    public void move() {
        System.out.println("жмем на падель " + speed);
    }
}
