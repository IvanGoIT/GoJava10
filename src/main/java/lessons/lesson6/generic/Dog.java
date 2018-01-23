package lessons.lesson6.generic;

public class Dog<T> {
    public String name;
    public T obj;

    public T getObj() {
        return obj;
    }
}
