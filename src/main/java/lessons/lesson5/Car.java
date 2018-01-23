package lessons.lesson5;

public class Car {
    // public доступен всем
    // protected .. доступен в этом классе *
    // private доступен только в этом классе

    public static String lastName;

    public String name= "default";
    public int price = 100;

    public Wheel[] wheels = {
            new Wheel("China"),
            new Wheel("USA"),
            new Wheel("China"),
            new Wheel("Ukraine")
    };

    public Car() {
        this("no name");
    }

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int price) {
        this.name = name;
        lastName = name;
        this.price = price;
    }

    public void show() {
        System.out.println("name:" + name + "\tprice:" + price);
        System.out.println("Wheels:");
        for(int i = 0; i < wheels.length; i++) {
            Wheel wheel = wheels[i];

            System.out.println("\t[" + i + "]"
                    + " madeIn:" + wheel.getMadeIn()
                    + "\tprice:" + wheel.getPrice());
        }
    }

    public static void sayHello() {
        System.out.println("hello");
    }
}
