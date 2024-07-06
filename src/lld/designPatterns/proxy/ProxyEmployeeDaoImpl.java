package lld.designPatterns.proxy;

public class ProxyEmployeeDaoImpl implements EmployeeDao{
    EmployeeDao employeeDao;
    public ProxyEmployeeDaoImpl(){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("Admin")){
            employeeDao.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("Admin")){
            employeeDao.delete(client,employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("Admin") || client.equals("user")){
            return employeeDao.get(client,employeeId);
        }
        return null;
    }
}
