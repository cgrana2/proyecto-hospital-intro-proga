
package proyecto;

import java.util.Arrays;

public class Bacteria {
    private String nombre;
    private String tipo;
    private String [] sintomas;
    private String [] recomendaciones;
    
    
    public Bacteria(){
        this.nombre="";
        this.tipo="";
       
    }
    public Bacteria(String nombre, String tipo, String[] sintomas, String[] recomendaciones){
        this.nombre=nombre;
        this.tipo=tipo;
        this.sintomas = sintomas;
        this.recomendaciones = recomendaciones;
       
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

      public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
      
     public String[] getSintomas() {
        return sintomas;
    }
      
      public String[] getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomencadiones(String[] recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public boolean evaluarSintomas(String[] sintomas) {
        boolean tieneSintomas = true;

        for (int i=0; i<sintomas.length; i++) {
            if (Arrays.asList(this.sintomas).contains(sintomas[i]) == false) {
                tieneSintomas = false;
            }
        }

        return  tieneSintomas;
    }

    public String mostrarRecomendaciones() {
        String recommendaciones = "";

        for (int i=0; i<this.recomendaciones.length; i++) {
            recommendaciones += this.recomendaciones[i] + ", ";
        }

        return recommendaciones;
    }
    
}