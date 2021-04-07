package Java.OOPs.Basic.non_access_modifier.Abstract.example;

public class Company {
    public static void main(String[] args) {
        IT it = new IT();
        System.out.println(it.getBalanceReport());
        System.out.println(it.getCompanyAddress());
        Finance finance = new Finance();
        System.out.println(finance.getBalanceReport());
        System.out.println(finance.getCompanyAddress());
    }
}
