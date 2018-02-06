package lessons.lesson9;

public class EventExample {

    public static void download(Runnable onComplete){
        System.out.println("Загрузка началась");
        try {
            Thread.sleep(2000); // симуляция загрузки (поток спит 2 секунды)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка завершилась");
        onComplete.run();
    }

    public static void main(String[] args) {

        Runnable onComplete = () -> {
            System.out.println("Уведомляем пользователя о завершении загрузки");
        };

        Runnable onComplete2 = () -> {
            System.out.println("Ура загрзка завершилась!!! ))))");
        };

        Runnable downloadInThread = () -> {
            download(onComplete);
        };

        new Thread(downloadInThread).start();
    }
}
