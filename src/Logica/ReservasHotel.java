
package Logica;


public class ReservasHotel {
    private String nombrePersona;
    private int numeroPersonas;
    private String fechaIngreso;
    private String Servicio;
    private Double precio;
    private int telef;
    private String check;

    public ReservasHotel() {
    }

    public ReservasHotel(String nombrePersona, int numeroPersonas, String fechaIngreso, String Servicio, Double precio, int telef, String check) {
        this.nombrePersona = nombrePersona;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.Servicio = Servicio;
        this.precio = precio;
        this.telef = telef;
        this.check = check;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    
    
   
}

   

    
    

