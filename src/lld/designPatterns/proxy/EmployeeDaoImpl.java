package lld.designPatterns.proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching");
        return new Employee();
    }
}
