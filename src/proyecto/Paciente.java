
package proyecto;
public class Paciente {
     private String nombre;
     private String apellido;
     private String cedula;
     private int nivelLinfocitos;
     private int nivelNeutrofilos;
     private String[] sintomas;

     public Paciente(String nombre, String apellido, String cedula, int nivelLinfocitos, int nivelNeutrofilos, String[] sintomas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.nivelLinfocitos = nivelLinfocitos;
        this.nivelNeutrofilos = nivelNeutrofilos;
        this.sintomas = sintomas;
    }
 
    public String getNombre() {
        return nombre;
    }
     public String getApellido() {
        return apellido;
    }
     public String getCedula() {
        return this.cedula;
    }
     public int getNivelLinfocitos() {
        return nivelLinfocitos;
    }
     public int getNivelNeutrofilos() {
        return nivelNeutrofilos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
   
    public void setNivelLinfocitos(int nivelLinfocitos) {
        this.nivelLinfocitos = nivelLinfocitos;
    }

    public void setNivelNeutrofilos(int nivelNeutrofilos) {
        this.nivelNeutrofilos = nivelNeutrofilos;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

}

