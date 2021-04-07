package Java.MultiThreading.Excersies;

public class AscendingHackerThread extends Hacker {

    public AscendingHackerThread(SecureVault secureVault) {
        super(secureVault);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            boolean isHacked = secureVault.isCorrectPassKey(i);
            if (isHacked) {
                System.out.println("hacked.....pass key is " + i);
                System.exit(0);
            }
        }
    }
}
