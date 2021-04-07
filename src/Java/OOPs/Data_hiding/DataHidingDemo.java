package Java.OOPs.Data_hiding;

class Student{
    private String name = "Afzal";
    public String getName(){
        return name;
    }
}

public class DataHidingDemo {
    /**
     * Hiding data member of the class ,
     * it can be achieve by declaring them as private and
     * allow them to access some other member function
     */
    public static void main(String[] args) {
        Student student = new Student();
        // since it's private you can't access
        // System.out.println(student.name);
        System.out.println(student.getName());
    }
}
