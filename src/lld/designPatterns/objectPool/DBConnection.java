package lld.designPatterns.objectPool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection mysqlConnection;
    DBConnection(){
        try {
            mysqlConnection = DriverManager.getConnection("url","userName","password");
        }
        catch (Exception e){

        }
    }
}
