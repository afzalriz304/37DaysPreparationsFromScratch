package Java.MultiThreading.Excersies;

public class Police extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Police will come in " + i + " sec");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("You caught ! Game over...");
        System.exit(0);
    }
}
