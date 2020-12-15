
package proyecto;
public class Medico {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;
    private boolean disponibilidad;
    private int posicion;
    private int cantidadAtentidos;
    
    
    public Medico(){
        this.nombre = "";
        this.apellido = "";
        this.especialidad = "";
        this.telefono = "";
        this.disponibilidad = true;
    }
     public Medico(String nombre, String apellido, String telefono, boolean disponibilidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.disponibilidad = disponibilidad;
        this.posicion = 0;
         this.cantidadAtentidos = 0;
     }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getCantidadAtentidos() {
        return cantidadAtentidos;
    }

    public void setCantidadAtentidos(int cantidadAtentidos) {
        this.cantidadAtentidos = cantidadAtentidos;
    }

    public void agregarRegistroDeAtentidos() {
        this.cantidadAtentidos++;
    }
}
