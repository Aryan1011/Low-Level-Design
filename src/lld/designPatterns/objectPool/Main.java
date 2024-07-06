package lld.designPatterns.objectPool;

public class Main {
    /**
     * manages the pool of reusable objects like DBconnection
     * Borrows, uses it, returns to the pool
     * You have Resource and a ResourcePoolManager
     * this manager handles everything, if anyone wants
     * what should be the configuration
     */
    public static void main(String[] args) {
        // this manager should be singleton and thread safe
        // use synchronised and make it singleton
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        DBConnection connection = dbConnectionManager.getDBConnection();
        DBConnection connection1 = dbConnectionManager.getDBConnection();
        DBConnection connection2= dbConnectionManager.getDBConnection();
        DBConnection connection3 = dbConnectionManager.getDBConnection();
        DBConnection connection4 = dbConnectionManager.getDBConnection();
        DBConnection connection5 = dbConnectionManager.getDBConnection();
        DBConnection connection6 = dbConnectionManager.getDBConnection();

    }
}
