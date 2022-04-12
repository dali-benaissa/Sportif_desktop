package sportifyjava.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS CELERON
 */
public class MyConnection {
    public String url="jdbc:mysql://127.0.0.1/sportify";
    public String login="root";
    public String pwd="";

    Connection cnx;
    public static MyConnection instance;
    private MyConnection (){
        
        try {
          cnx=  DriverManager.getConnection(url,login,pwd);
          System.out.println("Connexion etablie");
        } catch (SQLException ex) {
          System.err.println(ex.getMessage());        }
    }
    public Connection getCnx(){
        return cnx;
    }
    public static MyConnection getInstance(){
    if(instance == null){
        instance = new MyConnection();
    } 
    return instance;
    
    
    
    }
}