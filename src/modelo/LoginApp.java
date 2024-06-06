/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bia
 */
public class LoginApp {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public login log(String correo, String contrasena) {
        login l = new login();
        String sql = "SELECT * FROM Empleados WHERE correo = ? AND contrasena = ?";
        try {
            con = (Connection) cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            String encriptedContrasena = Encriptar.hashPassword(contrasena);
            ps.setString(2, contrasena);
            System.out.println("Contraseña encriptada al hacer login: " + encriptedContrasena);
            rs = ps.executeQuery();
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setContrasena(rs.getString("contrasena"));
                l.setCargo(rs.getString("cargo"));
                
                String storedHash = rs.getString("contrasena");
                System.out.println("\nHash almacenado: " + storedHash);
                System.out.println("Hash ingresado: " + encriptedContrasena);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }

    public boolean Registro(login reg) {
        String sql = "INSERT INTO empleados (nombre, cargo, correo, contrasena) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getCargo());
            ps.setString(3, reg.getCorreo());
            String encriptedContrasena = Encriptar.hashPassword(reg.getContrasena());
            ps.setString(4, reg.getContrasena());
            System.out.println("Contraseña encriptada al registrar: " + encriptedContrasena);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
