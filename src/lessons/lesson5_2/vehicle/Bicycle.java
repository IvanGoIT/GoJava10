package lessons.lesson5_2.vehicle;

public class Bicycle extends Vehicle {

    public String jingle = "дзынь дзынь";

    public Bicycle(float speed, float mass) {
        super(speed, mass);
    }

    @Override
    public void move() {
        System.out.println("крутим педали " + speed);
    }
}
