package BasicPrograms.Misc;

import java.util.Random;

public class CoinToss {

    static int callForA = 6;

    public static void getDistribution(){
        Random r = new Random();
        for(int i=0;i<10;i++){
            int chance = (int)(10 * Math.random());
            //int chance = r.nextInt(10);
            if(chance<=callForA){
                A();
            }else{
                B();
            }
        }
        //System.out.println((int) (10* Math.random()) & 1);
    }

    public static void A(){
        System.out.println("A is calling");
    }

    public static void B(){
        System.out.println("B is calling");
    }

    public static void main(String[] args) {
        getDistribution();
    }
}
