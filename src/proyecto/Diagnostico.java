
package proyecto;

public class Diagnostico {
    private String sintomas;
    private String enfermedad;
    private String pruebas;
    private String tratamiento;
    
    public Diagnostico(){
        this.sintomas="";
        this.enfermedad="";
        this.pruebas="";
        this.tratamiento="";
        
    }
    public Diagnostico(String sintomas, String enfermedad, String pruebas, String tratamiento){
        this.sintomas=sintomas;
        this.enfermedad=enfermedad;
        this.pruebas=pruebas;
        this.tratamiento=tratamiento;
        
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getPruebas() {
        return pruebas;
    }

    public void setPruebas(String pruebas) {
        this.pruebas = pruebas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
}
