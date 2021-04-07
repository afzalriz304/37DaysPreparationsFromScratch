package Java.OOPs.Basic.non_access_modifier.Abstract.example;

public class IT extends Department{
    @Override
    public void getAuditReport() {

    }

    @Override
    public boolean getProfitReport() {
        System.out.println("Printing profit report");
        return false;
    }

    @Override
    public int getBalanceReport() {
        System.out.println("Printing balance report");
        return 44444;
    }
}
