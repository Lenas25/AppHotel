
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;

public class ReservasHotelDB {
    Connection con;
    PreparedStatement ps;
    Conexion cn=new Conexion();
    ResultSet rs;
    
    public boolean RegistrarReserva(ReservasHotel nuevaRes){
        String sql="INSERT INTO reservas (nombrePersona, numPersonas, fechaIngreso, eleccionServicio, precioRes, telef, check_in_out) VALUES (?,?,?,?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nuevaRes.getNombrePersona());
            ps.setInt(2, nuevaRes.getNumeroPersonas());
            ps.setString(3, nuevaRes.getFechaIngreso());
            ps.setString(4, nuevaRes.getServicio());
            ps.setDouble(5, nuevaRes.getPrecio());
            ps.setInt(6, nuevaRes.getTelef());
            ps.setString(7, nuevaRes.getCheck());
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListarReserva(){
        List<ReservasHotel> ListaR=new ArrayList();
        String sql="SELECT * FROM reservas";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){ //recorrer las listas
                ReservasHotel res=new ReservasHotel();
                res.setNombrePersona(rs.getString("nombrePersona"));
                res.setNumeroPersonas(rs.getInt("numPersonas"));
                res.setFechaIngreso(rs.getString("fechaIngreso"));
                res.setServicio(rs.getString("eleccionServicio"));
                res.setPrecio(rs.getDouble("precioRes"));
                res.setTelef(rs.getInt("telef"));
                res.setCheck(rs.getString("check_in_out"));
                ListaR.add(res);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaR;
    }
    
    public void ConsultarServicio(JComboBox reserva){
        String sql="Select nombreServicio FROM servicios";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                reserva.addItem(rs.getString("nombreServicio"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    public ReservasHotel BuscarPrecio(String nombreServicioElegido){
        ReservasHotel  serv=new ReservasHotel();
        String sql="SELECT * FROM servicios WHERE nombreServicio = ?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombreServicioElegido);
            rs=ps.executeQuery();
            if (rs.next()) {
                serv.setPrecio(rs.getDouble("precio"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return serv;
    }
    
    public boolean ActualizarCheck(String check, String nombrePersona){
        String sql="UPDATE reservas SET check_in_out=? WHERE nombrePersona=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, check);
            ps.setString(2, nombrePersona);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
}
