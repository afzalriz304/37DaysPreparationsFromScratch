package Java.MultiThreading.Excersies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecureVaultHacking {

    public static void main(String[] args) throws InterruptedException {
        int passKey  = new Random().nextInt(10000);
        SecureVault vault = new SecureVault(passKey);

        Hacker asc_hacker1 = new AscendingHackerThread(vault);
        Hacker desc_hacker1 = new DescendingHackerThread(vault);
        Police police = new Police();

        List<Thread> threadList = new ArrayList<>();
        threadList.add(asc_hacker1);
        threadList.add(desc_hacker1);
        threadList.add(police);

        for (Thread thread:threadList){
            thread.start();
        }
    }
}
