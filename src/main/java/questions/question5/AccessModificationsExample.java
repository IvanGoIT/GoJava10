package questions.question5;

import questions.question5.entities.Cat;
import questions.question5.entities.Dog;

public class AccessModificationsExample {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 100;
        cat.name = "123";

//        Dog dog = new Dog();
//        dog.age = 100;        // ошибка
//        dog.name = "123";     // ошибка
    }
}
