package Java.OOPs.Basic;

public class ConfirmingSingleton {
    public static void main(String[] args) {
        SingletonDemo singletonDemo0 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        System.out.println(singletonDemo0);
        System.out.println(singletonDemo1);
        System.out.println(singletonDemo2);

    }
}
