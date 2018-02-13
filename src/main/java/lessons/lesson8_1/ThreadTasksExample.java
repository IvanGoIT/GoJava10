package lessons.lesson8_1;

import java.util.concurrent.*;

public class ThreadTasksExample {

    private static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int result = 0;

    private static void callable() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        int[] arr = {1, 2, 3, 5, 2, 6, 2, 7, 4, 7, 8, 10};


        Runnable r = new Runnable() {
            @Override
            public void run() {
                result = sum(arr);
            }
        };
        Future futureRunnable = service.submit(r);
        futureRunnable.get(); // ожидаем завершения Runnable
        System.out.println("Сумма = " + result);



        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return sum(arr);
            }
        };
        Future<Integer> futureCallable = service.submit(c);
        System.out.println("Сумма = " + futureCallable.get());

        service.shutdown();
    }

    private static void futureTask() throws ExecutionException, InterruptedException {
        int[] arr = {1, 6, 2, 8, 3, 7, 4, 7, 2, 7, 0, 2, 3, 5};
        FutureTask<Integer> task = new FutureTask<Integer>(() -> {
            return sum(arr);
        });
        new Thread(task).start();
        System.out.println("Сумма = " + task.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callable();
        futureTask();
    }
}
