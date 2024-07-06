package lld.designPatterns.objectPool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionManager {
    List<DBConnection> freeConnections = new ArrayList<>();
    List<DBConnection> inUseConnections = new ArrayList<>();
    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 3;

    public DBConnectionManager(){
        for(int i=1;i<=MAX_POOL_SIZE;i++){
            freeConnections.add(new DBConnection());
        }
    }

    public DBConnection getDBConnection(){
        if(freeConnections.isEmpty() && inUseConnections.size()<MAX_POOL_SIZE){
            freeConnections.add(new DBConnection());
        } else if (freeConnections.isEmpty() && inUseConnections.size()>=MAX_POOL_SIZE) {
            return null;
        }
        DBConnection dbConnection = freeConnections.remove(freeConnections.size()-1);
        inUseConnections.add(dbConnection);
        return dbConnection;
    }

    public void release(DBConnection dbConnection){
        freeConnections.add(dbConnection);
        inUseConnections.remove(dbConnection);
    }
}
