
package proyecto;

import javax.swing.*;

public class  Diagniostico{
    private Bacteria bacteria;
    private Virus virus;
    private Medico medico;
    private Paciente paciente;
    private String resultado;

    public Diagniostico(Paciente paciente, Medico medico, String resultado){
       this.paciente=paciente;
       this.medico = medico;
       this.resultado = resultado;
    }

    public Bacteria getBacteria() {
        return this.bacteria;
    }
    
    
    public Virus getVirus() {
        return this.virus;
    }
    

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
    public Medico getMedico() {
        return medico;
    }

     
     public Paciente getPaciente() {
        return this.paciente;
    }
    
  
    public void setBacteria(Bacteria bacteria) {
        this.bacteria = bacteria;
    }
    
    public void setVirus(Virus virus) {
        this.virus = virus;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    public void mostrar() {
        String nombre = "";
        String recomentaciones = "";

        if (this.resultado == "bacteria") {
            nombre = this.bacteria.getNombre();
            recomentaciones = this.bacteria.mostrarRecomendaciones();
        } else {
            nombre = this.virus.getNombre();
            recomentaciones = this.virus.mostrarRecomendaciones();
        }

        JOptionPane.showMessageDialog(null,
        "Paciente ("+this.paciente.getNombre()+") fue atendido por Dr. "+
                this.medico.getNombre()+". \n" +
                "Se diagnostico que tiene un(a) "+this.resultado+ " llamado(a): "+nombre+"\n"
                + "Sus recomendaciones son: "+recomentaciones
        );
    }
    
}

