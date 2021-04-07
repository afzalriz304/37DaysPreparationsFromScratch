package Java.OOPs.Basic;

public class SingletonDemo {

    public static final SingletonDemo SINGLETON_DEMO = new SingletonDemo();

    public static SingletonDemo getInstance(){
        return SINGLETON_DEMO;
    }

    /*private SingletonDemo(){
        return SINGLETON_DEMO;
    }*/

}
