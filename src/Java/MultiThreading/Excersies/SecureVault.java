package Java.MultiThreading.Excersies;

public class SecureVault {
    String money = "$20000";
    int password;

    public SecureVault(int password) {
        this.password = password;
        System.out.println(password);
    }

    public boolean isCorrectPassKey(int guess) {
        try {
            Thread.sleep(5);
            if (guess == this.password) {
                return true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

}
