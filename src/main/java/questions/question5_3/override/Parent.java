package questions.question5_3.override;

public class Parent {
    private String name = "Dart";
    private String lastname = "Vader";

    public void hello() {
        System.out.println("Hello I'm your father");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
