
package Logica;

public class ServiciosHotel {
    private int Id;
    private String nombreServicio;
    private double precio;
    private String descripcion;
    private int disponibilidad;

    public ServiciosHotel() {
    }

    public ServiciosHotel(int Id, String nombreServicio, double precio, String descripcion, int disponibilidad) {
        this.Id = Id;
        this.nombreServicio = nombreServicio;
        this.precio = precio;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

   
    
    
}
