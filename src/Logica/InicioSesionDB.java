
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InicioSesionDB {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn=new Conexion();
    
    public InicioSesion log(String nombreUsuario, String contra){
        InicioSesion l=new InicioSesion();
        String sql="SELECT * FROM usuarios WHERE nombreUsuario = ? AND contra = ?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, contra);
            rs=ps.executeQuery();
            if (rs.next()) {
                l.setNombreUsuario(rs.getString("nombreUsuario"));
                l.setContra(rs.getString("contra"));
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return l;
    }
    
    public boolean RegistrarUsuario(InicioSesion nuevo){
        String sql="INSERT INTO usuarios (nombreApellido, nombreUsuario, contra) VALUES (?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nuevo.getNombreApellido());
            ps.setString(2, nuevo.getNombreUsuario());
            ps.setString(3, nuevo.getContra());
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
}
