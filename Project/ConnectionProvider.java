/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

/**
 *
 * @author Dell
 */
public class ConnectionProvider {
 public static Connection getCon()
    {
        try{
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection con=DriverManager.getConnection("jdbc:odbc:ProjectDemo");
           return con;
        }catch(Exception e){
            return null;
        }
    }   
}
