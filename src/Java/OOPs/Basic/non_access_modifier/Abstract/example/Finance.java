package Java.OOPs.Basic.non_access_modifier.Abstract.example;

public class Finance extends Department {
    @Override
    public void getAuditReport() {

    }

    @Override
    public boolean getProfitReport() {
        return false;
    }

    @Override
    public int getBalanceReport() {
        System.out.println("Printing balance report");
        return 22222;
    }

    @Override
    public String getCompanyAddress() {
        return "HashedIn by Deloitte";
    }
}
