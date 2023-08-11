
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ContactoDB {
    Connection con;
    PreparedStatement ps;
    Conexion cn=new Conexion();
    
    
    public boolean RegistrarContacto(ContactoHotel nuevoContacto){
        String sql="INSERT INTO contactanos (nombrePersona, celularPersona, correoPersona, mensaje) VALUES (?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, nuevoContacto.getNombrePersona());
            ps.setInt(2, nuevoContacto.getCelularPersona());
            ps.setString(3, nuevoContacto.getCorreoPersona());
            ps.setString(4, nuevoContacto.getMensaje());
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
}
