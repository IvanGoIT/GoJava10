package lessons.lesson6;

import questions.question5.entities.Dog;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(2);

        Iterator<Integer> iterator = hashSet.iterator();

        while(iterator.hasNext()) {
            Integer x = iterator.next();
            System.out.println(x);
        }
    }
}
