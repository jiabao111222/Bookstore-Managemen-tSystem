/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreinventory;

import java.sql.Connection;         //connection statement
import java.sql.DriverManager;      //build connection
import java.sql.SQLException;       

/**
 *
 * @author karpoh
 */
public class Connections {
    private static final String USERNAME = "root";  //no restriction
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/bookstore";  //datab locate
   
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);    //data to connect to database, url, user,pass
            System.out.println("Connected!");
        }catch (SQLException a){
            System.err.println(a);
        }
        return con;
        
    }
    
}
