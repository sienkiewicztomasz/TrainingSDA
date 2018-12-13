package pl.sda.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//public class ThreadRunner {
//
//    public static final long MAX_VALUE = 10_000_000_000L;
//
////    public static void main(String[] args) {
//
//        execute(MAX_VALUE);
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                execute(MAX_VALUE);
//            }
//        });
//        thread1.start();
//        execute(MAX_VALUE);
//   //     runMultipleThreads();
//
//    }
//
//    private static void runMultipleThreads() throws InterruptedException {
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        List<Callable<String>> tasks = new ArrayList<>();
//
//        for (int i = 0; i<10; i++) {
//
//            tasks.add(new Callable<String>() {
//                @Override
//                public String call() throws Exception {
//                    for (long l=0; l<MAX_VALUE/10; l++)
//                    return null;
////                }
//            });
//        }
//        long startTime = System.nanoTime();
//        List<Future<String>> futures = executorService.invokeAll(tasks);
////        for ((Future<String> result : futures)result.get();
////        long endTime = System.nanoTime();
////        System.out.println(Thread.currentThread().getName() + ((double)endTime - startTime))/1000000000;
//
//    }
//
//    private static void execute(long value) {
//        long startTime = System.nanoTime();
//        for (long l = 0; l < value; l++) ;
//        long endTime = System.nanoTime();
//        System.out.println((double)(endTime - startTime) / 1_000_000_000);
//    }
//
//
//}
