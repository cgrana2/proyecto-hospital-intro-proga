
package proyecto;
public class Virus {
    private String nombre;
    private String tipo;
    private String hemograma;
    
    public Virus(){
        this.nombre="";
        this.tipo="";
        this.hemograma="";
    }
    public Virus(String nombre, String tipo, String hemograma){
        this.nombre=nombre;
        this.tipo=tipo;
        this.hemograma=hemograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHemograma() {
        return hemograma;
    }

    public void setHemograma(String hemograma) {
        this.hemograma = hemograma;
    }
    
}
