/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabal
 */
public class ConnectionFactory {
    public Connection getconnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/vendas", "root", "1234");
        }
        catch (SQLException excecao){
            throw new RuntimeException(excecao);
        }
}

    
}
