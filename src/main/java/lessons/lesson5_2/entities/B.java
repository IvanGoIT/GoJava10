package lessons.lesson5_2.entities;

public class B extends A {
    public String name;

    public B(String name, String text, int value) {
        super(text, value);
        this.name = name;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("name:  " + name);
    }
}
