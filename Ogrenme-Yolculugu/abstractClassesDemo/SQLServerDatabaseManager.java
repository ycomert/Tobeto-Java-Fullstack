package abstractClassesDemo;

public class SQLServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi: SQL Server");
    }
}
