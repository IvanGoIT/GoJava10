package lessons.lesson5_2.vehicle.car;

public class SuperCar extends Car {
    public SuperCar(float speed, float mass) {
        super(speed, mass);
    }

    public void superSpeed() {
        this.speed *= 2;
    }
}
