
package proyecto;

public class Hospital {
    private String nombre;
    private int capacidad;
    private Hemograma hemograma;
    
    public Hospital(String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.hemograma=new Hemograma();
    }
    
    public void atender(Paciente paciente ){
      String resultado=this.hacerHemograma(paciente);
      if (resultado=="bacteria"){
          
      }
    }
    
    private String hacerHemograma(Paciente paciente){
     
        int linfocitos=paciente.getNivelLinfocitos();
        int neutrofilos=paciente.getNivelNeutrofilos();
        return this.hemograma.operar(linfocitos, neutrofilos);
    }
}
        