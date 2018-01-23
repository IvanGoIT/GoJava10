package lessons.lesson6;



import questions.question5.entities.Dog;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Dog> linkedList = new LinkedList<>();

        linkedList.addLast(new Dog("ddd", 3));
        linkedList.addLast(new Dog("aa", 1));
        linkedList.addLast(new Dog("cccc", 4));

        Iterator<Dog> iterator = linkedList.iterator();

        while(iterator.hasNext()) {
            Dog dog = iterator.next();
            System.out.println(dog.getName());
        }
    }
}
