package BasicPrograms.String;

public class TestImmutability {
    public static void main(String[] args) {
        String name0 = new String("Afzal");
        String name1 = "Afzal";
        String name2 = "Afzal";
        StringBuffer name3 = new StringBuffer("Afzal");
        StringBuffer name4 = new StringBuffer("Afzal");
        //System.out.println(this.name0);
        System.out.println(name0.equals(name2));
        System.out.println(Integer.toHexString(name0.hashCode()));
        System.out.println(Integer.toHexString(name1.hashCode()));
        System.out.println(Integer.toHexString(name2.hashCode()));
        System.out.println(Integer.toHexString(name3.hashCode()));
        System.out.println(Integer.toHexString(name4.hashCode()));
    }
}
