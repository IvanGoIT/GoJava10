package lessons.lesson5_2.vehicle;

public class Skateboard extends Vehicle{

    public String emery = "простой наждак";

    public Skateboard(float speed, float mass) {
        super(speed, mass);
    }

    @Override
    public void move() {
        System.out.println("толкаем ногой " + speed);
    }
}
