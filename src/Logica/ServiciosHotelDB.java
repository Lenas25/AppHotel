
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.JComboBox;

public class ServiciosHotelDB {
    Connection con;
    PreparedStatement ps;
    Conexion cn=new Conexion();
    ResultSet rs;
    
    public boolean RegistrarServicio(ServiciosHotel nuevo){
        String sql="INSERT INTO servicios (nombreServicio, precio, descripcion, disponibilidad) VALUES (?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nuevo.getNombreServicio());
            ps.setDouble(2, nuevo.getPrecio());
            ps.setString(3, nuevo.getDescripcion());
            ps.setInt(4, nuevo.getDisponibilidad());
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListarServicio(){
        List<ServiciosHotel> ListaS=new ArrayList();
        String sql="SELECT * FROM servicios";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){ //recorrer las listas
                ServiciosHotel sh=new ServiciosHotel();
                sh.setId(rs.getInt("id"));
                sh.setNombreServicio(rs.getString("nombreServicio"));
                sh.setPrecio(rs.getDouble("precio"));
                sh.setDescripcion(rs.getString("descripcion"));
                sh.setDisponibilidad(rs.getInt("disponibilidad"));
                ListaS.add(sh);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaS;
    }
    
    public boolean EliminarServicio(int id ){
        String sql="DELETE FROM servicios WHERE id = ?";
        try{
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException ex){
                System.out.println(ex.toString());
            }
        }
    }
    
    public ServiciosHotel BuscarDatos(String nombreServicio){
        ServiciosHotel  serv=new ServiciosHotel();
        String sql="SELECT * FROM servicios WHERE nombreServicio = ?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombreServicio);
            rs=ps.executeQuery();
            if (rs.next()) {
                serv.setPrecio(rs.getDouble("precio"));
                serv.setDescripcion(rs.getString("descripcion"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return serv;
    }
    public void ConsultarServicio(JComboBox servicio){
        String sql="Select nombreServicio FROM servicios";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                servicio.addItem(rs.getString("nombreServicio"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
}
