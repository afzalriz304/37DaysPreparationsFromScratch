package Java.MultiThreading.Excersies;

public class DescendingHackerThread extends Hacker {
    public DescendingHackerThread(SecureVault secureVault) {
        super(secureVault);
    }

    @Override
    public void run() {
        for (int i = 10000; i > 1; i--) {
            boolean isHacked = secureVault.isCorrectPassKey(i);
            if (isHacked) {
                System.out.println("hacked.....pass key is " + i);
                System.exit(0);
            }
        }
    }
}
