package questions.question5;

public class CodeExample {

    static boolean doorState = false, windowState = true;

    public static void main(String[] args) {
        showOld();
        show();

        openDoor();
        show();

        toggleDoor();
        show();
    }

    public static void show() {
        System.out.println("*** CarDoor state ***");
        System.out.println("Car door - " + (doorState ? "open" : "close"));
        System.out.println("Car window - " + (windowState ? "open" : "close"));
        System.out.println();
    }

    public static void showOld() {
        System.out.println("*** CarDoor state ***");
        if (!doorState) {
            System.out.println("Car door - close");
        } else System.out.println("Car door - open");
        if (!windowState) {
            System.out.println("Car window - close");
        } else System.out.println("Car window - open");
    }

    public static void openDoor() {
        if (!doorState) toggleDoor();
    }

    public static void closeDoor() {
        if (doorState) toggleDoor();
    }

    public static void toggleDoor() {
        doorState = !doorState; //поменяли значение на противоположное
    }
}
