package Java.OOPs.Basic;

class Animal{
    private String name;
}


public class WaysToCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Animal tiger = new Animal();
        System.out.println(tiger);
        Class cls= Class.forName("Animal");
        Animal cow = (Animal) cls.newInstance();
        System.out.println(cow);
    }
}
