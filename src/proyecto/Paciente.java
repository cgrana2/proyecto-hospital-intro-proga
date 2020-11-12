
package proyecto;
import javax.swing.JOptionPane;
public class Paciente {
     private String nombre;
     private String apellido;
     private String cedula;
     private int nivelLinfocitos;
     private int nivelNeutrofilos;
     
    public Paciente(){
        this.nombre="";
        this.apellido="";
        this.cedula="";
        
    }
    
     public Paciente(String nombre, String apellido, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        
    }

    public String getCedula() {
        return this.cedula;
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

    public int getNivelLinfocitos() {
        return nivelLinfocitos;
    }

    public void setNivelLinfocitos(int nivelLinfocitos) {
        this.nivelLinfocitos = nivelLinfocitos;
    }

    public int getNivelNeutrofilos() {
        return nivelNeutrofilos;
    }

    public void setNivelNeutrofilos(int nivelNeutrofilos) {
        this.nivelNeutrofilos = nivelNeutrofilos;
    }
    
}
