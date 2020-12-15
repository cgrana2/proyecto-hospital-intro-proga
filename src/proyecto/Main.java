                           
                         //Proyecto de Camila Granados y Estefany Guerrero\\
package proyecto;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        Hospital hospital= new Hospital("Hospital",100);

        Paciente paciente1=new Paciente("Camila","Granados","403490122", 20, 30, new String[]{"gripe"});

        Medico medico1=new Medico("Allan","González","87564100",true);
        Medico medico2=new Medico("Luisa","Mora","209540423",false);
        Medico medico3=new Medico("Raquel","Solano","106680223",true);

        hospital.contratarMedico(medico1);
        medico1.setPosicion(0);
        hospital.contratarMedico(medico2);
        medico2.setPosicion(1);
        hospital.contratarMedico(medico3);
        medico3.setPosicion(2);

        int opcion = -1;

        while(opcion != 0) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion: \n 1. Para ser atendido \n 2. Atender cliente por defecto \n 3. Bitacora de atendidos \n 0. Salir"));

            if (opcion == 1) {
                hospital.atender(
                    hospital.pedirDatosAPaciente()
                );
            } else if (opcion == 2) {
                hospital.atender(paciente1);
            } else if (opcion == 3) {
                hospital.mostrarBitacoraDeDiagnosticos();
            }
        }
        
    }
    
}