
package proyecto;
public class Medico {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;
    private boolean disponibilidad;
    
    
    public Medico(){
        this.nombre="";
        this.apellido="";
        this.especialidad="";
        this.telefono="";
        this.disponibilidad=true;
    }
     public Medico(String nombre, String apellido, String telefono, boolean disponibilidad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.disponibilidad=disponibilidad;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
   
}
        
     
               
