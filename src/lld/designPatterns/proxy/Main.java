package lld.designPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new ProxyEmployeeDaoImpl();
            employeeDao.create("client",new Employee());
            employeeDao.create("Admin",new Employee());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
