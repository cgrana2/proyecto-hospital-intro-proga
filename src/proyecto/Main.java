// Proyecto de Camila Granados y Estefany Guerrero.
package proyecto;
public class Main {

    public static void main(String[] args){
        Hospital hospital=new Hospital("Hospital",100);
        // agregar pacientes en un array, minimo 5
        Paciente paciente1=new Paciente("Anthony","Soto","403490122");
        Medico medico1=new Medico("Alan","González","87564100",true);
        Medico medico2=new Medico("Luisa","Mora","209540423",true);
        Medico medico3=new Medico("Raquel","Solano","106680223",true);
        hospital.contratarMedico(medico1);
        hospital.contratarMedico(medico2);
        hospital.contratarMedico(medico3);
        // hacer un for que recorra los pacientes y que los atienda en el hospital
        // for i=0 -> hospital.atender(pacientes[i])
    }
    
}

