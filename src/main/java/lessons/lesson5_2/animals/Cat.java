package lessons.lesson5_2.animals;

public class Cat extends Animal {
    public String mustache;

    public Cat() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("мяу");
    }

    public Cat(String name, int age, String mustache) {
        super(name, age);
        this.mustache = mustache;
    }
}
