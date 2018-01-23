package lessons.lesson5_2.entities;

public class A {
    protected String text = "----";
    public int value = 1000;

    public A() {}

    public A(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public void show() {
        System.out.println("text:  " + text);
        System.out.println("value: " + value);
    }
}
