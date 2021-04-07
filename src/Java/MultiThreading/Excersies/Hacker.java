package Java.MultiThreading.Excersies;

public class Hacker extends Thread {

    protected SecureVault secureVault;

    public Hacker(SecureVault secureVault){
        this.secureVault = secureVault;
        this.setPriority(MAX_PRIORITY);
    }

    @Override
    public void start() {
        System.out.println("Hacker has entered.."+Thread.currentThread().getName());
        super.start();
    }
}
