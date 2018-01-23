package questions.question5.entities;

public class Dog {
    String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void method() {
        age = 123;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
