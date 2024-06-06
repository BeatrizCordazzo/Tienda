/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Bia
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
        try{
            String myBD = "jdbc:mysql://localhost:3306/tiendadiscos?useSSL=false";
            this.con = DriverManager.getConnection(myBD, "root", "1234");
            return con;
        } catch (Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
}
