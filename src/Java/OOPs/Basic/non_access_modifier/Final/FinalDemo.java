package Java.OOPs.Basic.non_access_modifier.Final;

public class FinalDemo extends initialize{
    final int a = 10;
    // you can inherit final class

    // you can override the final method

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.getCompany();
        // you can change the final value
        // finalDemo.a = 20;
    }
}

final class demo{

}
class initialize{
    final String getCompany(){
        return "Deloitte";
    }
}
