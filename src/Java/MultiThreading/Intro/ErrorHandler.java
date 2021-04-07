package Java.MultiThreading.Intro;

public class ErrorHandler {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Thread is started...");
            throw new RuntimeException("defaulted thread..");
        });
        thread.setName("New_worker_thread");
        thread.setUncaughtExceptionHandler((thread1, throwable) -> {
            System.out.println("A error occurred in the thread "+thread1.getName()+" error is "+throwable.getMessage());
        });
        thread.start();
        System.out.println("This is the main thread....");
    }
}
