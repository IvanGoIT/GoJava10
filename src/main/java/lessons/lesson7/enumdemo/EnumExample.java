package lessons.lesson7.enumdemo;

public class EnumExample {

    static void printType(DogType type) {
        if (type == DogType.Dalmatian)
            System.out.println("type is Dalmatian");
        if (type == DogType.Bobik)
            System.out.println("type is Bobik");
        if (type == DogType.Kokker)
            System.out.println("type is Kokker");
        if (type == DogType.Sharik)
            System.out.println("type is Sharik");
    }

    public static void main(String[] args) {
        DogType dogType = DogType.Dalmatian;

        printType(dogType);

        printType(DogType.Bobik);
        printType(DogType.Sharik);


        // dogType = DogType.Barsik; не существующий тип мы не можем присвоить
    }
}
