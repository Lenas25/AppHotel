
package Logica;

public class ContactoHotel {
    private String nombrePersona;
    private int celularPersona;
    private String correoPersona;
    private String mensaje;

    public ContactoHotel() {
    }

    public ContactoHotel(String nombrePersona, int celularPersona, String correoPersona, String mensaje) {
        this.nombrePersona = nombrePersona;
        this.celularPersona = celularPersona;
        this.correoPersona = correoPersona;
        this.mensaje = mensaje;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getCelularPersona() {
        return celularPersona;
    }

    public void setCelularPersona(int celularPersona) {
        this.celularPersona = celularPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
