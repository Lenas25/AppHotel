
package Logica;

public class InicioSesion {
    private int id;
    private String nombreApellido;
    private String nombreUsuario;
    private String contra;

    public InicioSesion() {
    }

    public InicioSesion(int id, String nombreApellido, String nombreUsuario, String contra) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
}
