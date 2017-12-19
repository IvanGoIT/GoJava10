package lessons.lesson5_2.animals;

public class Dog extends Animal {
    public int fangsCount;

    public Dog() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("гав");
    }

    public Dog(String name, int age, int fangsCount) {
        super(name, age);
        this.fangsCount = fangsCount;
    }
}
