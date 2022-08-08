package dev.doakes.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {


    public static Connection createConnection()
    {
        try
        {
            // return DriverManager.getConnection(System.getenv("project0")); "" needs to match your system environment variable
            return DriverManager.getConnection("jdbc://employee-exps.postgres.database.azure.com:5432/postgres?user=germaine486&password=bubbaboy85!&ssl=false");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
