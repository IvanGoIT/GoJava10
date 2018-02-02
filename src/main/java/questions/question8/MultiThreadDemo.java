package questions.question8;

import java.util.Scanner;

public class MultiThreadDemo {

    public static void multiFibonacciThreads(int n, int countOfThreads) throws InterruptedException {
        Thread[] threads = new Thread[countOfThreads];
        for(int i = 0; i < countOfThreads; i++) {
            threads[i] = new Thread(() -> {
                fibonacci(n);
            });
            threads[i].start();
        }
        for(int i = 0; i < countOfThreads; i++) {
            threads[i].join();
        }
    }

    public static void multiFibonacci(int n, int countOfThreads) throws InterruptedException {
        for(int i = 0; i < countOfThreads; i++)
                fibonacci(n);
    }

    public static long fibonacci(long n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Input data ...");
            int n = sc.nextInt();
            int countOfThreads = sc.nextInt();

            System.out.println("n = " + n);
            System.out.println("countOfThreads = " + countOfThreads);

            long startTime = System.currentTimeMillis();
            multiFibonacci(n, countOfThreads);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

            System.out.println("multiFibonacci \t\t\t Duration = " + duration);

            startTime = System.currentTimeMillis();
            multiFibonacciThreads(n, countOfThreads);
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;

            System.out.println("multiFibonacciThreads \t Duration = " + duration);
        }
    }


    // 1 method();


    // 2 method();


    // method
    // {
    //      for ( 1 000 000 ){
    //          int x = Random();
    //      }
    //      sout ( x );
    //      sout ( "hello" );
    // }


    // -------------------------------------------------------> T


    // 11111111111111111111111111111111111111111111111111 - один поток

    // 000000000001111111111111111111111111                          - два потока
    // 000000000002222222222222222222222222                          - два потока

}
