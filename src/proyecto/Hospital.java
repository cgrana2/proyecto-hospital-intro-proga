

package proyecto;

import javax.swing.*;

public class Hospital {

    private String nombre;
    private int capacidad;
    private Hemograma hemograma;
    private Medico[] medicos;
    private int cantidadMedicos;
    private Virus []  virus;
    private Bacteria [] bacterias;
    private Diagniostico[][] diagnosticos;

    int capacidadMedicos = 3;
    int capacidadBacterias = 3;
    int capacidadVirus = 3;
    int capacidadDiagnosticos = 3;

    public Hospital(String nombre, int capacidad){

        this.nombre = nombre;
        this.capacidad = capacidad;
        this.hemograma = new Hemograma();

        this.cantidadMedicos = 0;
        this.medicos = new Medico[capacidadMedicos];

        this.bacterias = new Bacteria [capacidadBacterias];
        this.virus = new Virus[capacidadVirus];

        this.diagnosticos = new Diagniostico[capacidadMedicos][capacidadDiagnosticos];

        bacterias[0]= new Bacteria("coccus","Bac", new String[]{"hinchazon","tos","dolor toracico"}, new String[]{"descansar"});
        bacterias[1]= new Bacteria("Bacilo","Bac2", new String[]{"fatiga","escalofrios","nauseas"}, new String[]{"descansar"});
        bacterias[2] = new Bacteria("Tetrad","Bac3", new String[]{"colicos estomacales","vomitos","gripe"}, new String[]{"descansar"});

        virus[0] = new Virus("Covid","19", new String[]{"fiebre","tos seca","cansancio"}, new String[]{"utilizar mascarilla","descansar","lavarse las manos"});
        virus[1]= new Virus("Influenza","Helical", new String[]{"fatiga","dolor de garganta","secrecion"}, new String[]{"evitar contancto","reposar","cubrir nariz y boca"});
        virus[2]= new Virus("VIH","spherical", new String[]{"fiebre alta","llagas genitales","perdida de peso"}, new String[]{"descansar","evitar la preocupacion","realizar ejercicios suaves"});
    }
    
    public Bacteria detectarBacteria(String[] sintomas){

        for(int i=0;i<capacidadBacterias;i++){
           if(bacterias[i].evaluarSintomas(sintomas)){
               return bacterias[i];
           }
        }

        return null;
    }
  
    public Virus detectarVirus(String[] sintomas){
        for(int i=0;i<capacidadVirus;i++){
            if(virus[i].evaluarSintomas(sintomas)){
                return virus[i];
            }
        }

        return null;
    }
  
    public void atender(Paciente paciente){
        String resultado = this.hacerHemograma(paciente);
        Medico medico = buscarMedicoDisponible();
        Diagniostico diagnostico = new Diagniostico(paciente, medico, resultado);


      if (resultado == "bacteria") {
 
        diagnostico.setBacteria(
            detectarBacteria(paciente.getSintomas())
        );
  
      } else if (resultado == "virus") {
        
        diagnostico.setVirus(
            detectarVirus(paciente.getSintomas())
        );
       
      }

      diagnosticos[medico.getPosicion()][medico.getCantidadAtentidos()] = diagnostico;
      medico.agregarRegistroDeAtentidos();
      diagnostico.mostrar();
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
    
  
    public Bacteria[] getBacterias() {
        return bacterias;
    }

    public void setBacteria(Bacteria[] bacteria) {
        this.bacterias = bacteria;
    }
    
    
    public Virus[] getVirus() {
        return this.virus;
    }

    public void setVirus(Virus[] virus) {
        this.virus = virus;
    }
    
    public void contratarMedico(Medico medico) {
        this.medicos[this.cantidadMedicos] = medico;
        this.cantidadMedicos++;
    }
    
 
    private String hacerHemograma(Paciente paciente){
     
        int linfocitos = paciente.getNivelLinfocitos();
        int neutrofilos = paciente.getNivelNeutrofilos();
        return this.hemograma.operar(linfocitos, neutrofilos);
    }

    private Medico buscarMedicoDisponible() {
        for (int i = 0; i<capacidadMedicos; i++) {
            if (medicos[i].isDisponibilidad() == true) {
                return medicos[i];
            }
        }

        return new Medico("Medico", "de Emergencia", "88451548", true);
    }

    public Paciente pedirDatosAPaciente() {
        String nombre = JOptionPane.showInputDialog(null, "Digite su nombre");
        String apellido = JOptionPane.showInputDialog(null, "Digite su apellido");
        String cedula = JOptionPane.showInputDialog(null, "Digite su cedula");
        int nivelLinfocitos= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nivel de linfocitos de 0 a 100"));
        int nivelNeutrofilos= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nivel de neutrofilos de 0 a 100"));
        String sintoma = JOptionPane.showInputDialog(null, "Digite su sintoma");

        return new Paciente(nombre, apellido, cedula, nivelLinfocitos, nivelNeutrofilos, new String[]{ sintoma });
    }

    public void mostrarBitacoraDeDiagnosticos() {
        String mensaje = "";

        for (int i=0; i<capacidadMedicos; i++) {
            mensaje = mensaje + "Dr. "+this.medicos[i].getNombre()+ " atendio: \n";
            for (int j=0; j<capacidadDiagnosticos; j++) {
                mensaje = mensaje + (j+1) +". ";
                if (diagnosticos[i][j] != null) {
                    mensaje = mensaje + diagnosticos[i][j].getPaciente().getNombre()+"\n";
                } else {
                    mensaje = mensaje + "Nadie \n";
                }
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

}