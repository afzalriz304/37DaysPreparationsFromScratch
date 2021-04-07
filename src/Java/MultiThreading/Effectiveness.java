package Java.MultiThreading;

class T1 implements Runnable{

    Effectiveness effectiveness;

    public T1(Effectiveness ef) {
        this.effectiveness=ef;
    }

    @Override
    public void run() {
        effectiveness.withOutThreading();
    }
}

class T2 implements Runnable{

    Effectiveness effectiveness;

    public T2(Effectiveness ef) {
        this.effectiveness=ef;
    }

    @Override
    public void run() {
        effectiveness.withOutThreading();
    }
}

public class Effectiveness {

    String str = new String();
    public void withOutThreading(){
        for (int j=0;j<10000;j++){
            for (int i=1;i<=10000;i++){
                //System.out.println("working"+i+"-"+j);
                str.concat("Af");
            }
        }
    }

    public static void main(String[] args) {
        Effectiveness effectiveness = new Effectiveness();
        long now0=System.currentTimeMillis();
        effectiveness.withOutThreading();
        System.out.println(System.currentTimeMillis()-now0+" ms");
        long now1=System.currentTimeMillis();
        new Thread(new T1(effectiveness)).start();
        new Thread(new T2(effectiveness)).start();
        System.out.println(System.currentTimeMillis()-now1+" ms");
    }
}
