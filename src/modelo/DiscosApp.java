/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Bia
 */
public class DiscosApp {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarDiscos(Discos dis){
        String sql = "INSERT INTO Discos(codigo, nombre, proveedor, stock, precio) VALUES(?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, dis.getCodigo());
            ps.setString(2, dis.getNombre());
            ps.setString(3, dis.getProveedor());
            ps.setInt(4, dis.getStock());
            ps.setDouble(5, dis.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public void ConsultarProveedor(JComboBox proveedor){
        String sql = "SELECT nombre FROM Proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                proveedor.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public List ListarDiscos(){
        List<Discos> ListaDis = new ArrayList();
        String sql = "SELECT * FROM Discos";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Discos dis = new Discos();
                dis.setId(rs.getInt("id"));
                dis.setCodigo(rs.getString("codigo"));
                dis.setNombre(rs.getString("nombre"));
                dis.setProveedor(rs.getString("proveedor"));
                dis.setStock(rs.getInt("stock"));
                dis.setPrecio(rs.getDouble("precio"));
                ListaDis.add(dis);
            }
        } catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaDis;
    }
    
    public boolean EliminarDiscos(int id){
        String sql = "DELETE FROM Discos WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
    public boolean ModificarDiscos(Discos dis){
        String sql = "UPDATE Discos SET codigo=?, nombre=?, proveedor=?, stock=?, precio=? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dis.getCodigo());
            ps.setString(2, dis.getNombre());
            ps.setString(3, dis.getProveedor());
            ps.setInt(4, dis.getStock());
            ps.setDouble(5, dis.getPrecio());
            ps.setInt(6, dis.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public Discos BuscarDis(String cod){
        Discos disco = new Discos();
        String sql = "SELECT * FROM Discos WHERE codigo=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                disco.setNombre(rs.getString("nombre"));
                disco.setPrecio(rs.getDouble("precio"));
                disco.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return disco;
    }
    
    public Datos BuscarDatos(){
        Datos datos = new Datos();
        String sql = "SELECT * FROM Empresa";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                datos.setId(rs.getInt("id"));
                datos.setRuc(rs.getString("ruc"));
                datos.setNombre(rs.getString("nombre"));
                datos.setTelefono(rs.getString("telefono"));
                datos.setDireccion(rs.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public boolean ModificarDatos(Datos dat){
        String sql = "UPDATE Empresa SET ruc=?, nombre=?, telefono=?, direccion=? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dat.getRuc());
            ps.setString(2, dat.getNombre());
            ps.setString(3, dat.getTelefono());
            ps.setString(4, dat.getDireccion());
            ps.setInt(5, dat.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
