
package proyecto;

public class Hospital {
    private String nombre;
    private int capacidad;
    private Hemograma hemograma;
    private Medico[] medicos;
    
    public Hospital(String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.hemograma=new Hemograma();
        this.medicos=new Medico[3];
    }
    
    public void atender(Paciente paciente ){
      String resultado=this.hacerHemograma(paciente);
      if (resultado=="bacteria"){
          
      }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Hemograma getHemograma() {
        return hemograma;
    }

    public void setHemograma(Hemograma hemograma) {
        this.hemograma = hemograma;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }
    
    private String hacerHemograma(Paciente paciente){
     
        int linfocitos=paciente.getNivelLinfocitos();
        int neutrofilos=paciente.getNivelNeutrofilos();
        return this.hemograma.operar(linfocitos, neutrofilos);
    }
}
        