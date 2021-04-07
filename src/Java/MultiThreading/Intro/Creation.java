package Java.MultiThreading.Intro;

public class Creation {
    public static void main(String[] args) {
        /**
         * Creating a thread
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // new thread will execute here
                System.out.println("We are now in the new thread name : "+Thread.currentThread().getName());
            }
        });
        // naming a thread
        thread.setName("New_Worker_Thread");
        // start thread
        thread.start();
        System.out.println("We are in the main Thread :"+ Thread.currentThread().getName());
    }
}
