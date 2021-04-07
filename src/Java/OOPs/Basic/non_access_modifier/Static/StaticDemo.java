package Java.OOPs.Basic.non_access_modifier.Static;

public class StaticDemo {
    static int static_a = 1;
    int non_static_a = 1;

    public static void main(String[] args) {
        incrementTo5();
    }

    public static void incrementTo5(){
        for (int i =0;i<5;i++){
            System.out.println(static_a++);
        }
    }
}
