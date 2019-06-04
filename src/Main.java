import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");

        System.out.println("Prueba de git");
        System.out.println("Segunda prueba para github");


        //Pruebas para repo de github
        String nombres = "Cesar Alonso";
        String apellido_pat ="Romero";
        String apellido_mat ="Garcia";
        int experiencia = 2;
        String ocupacion = "Consultor";
        String empresa = "MopegaTI";
        int ID = 31241;


        JOptionPane.showMessageDialog(null,
                "Buenas tardes Sr. "+ nombres +" "+ apellido_pat +" "+  apellido_mat + "\n" + "," +
                "la base de datos muestra que usted ocupa el puesto de: " + ocupacion + " en la Empresa: "+ empresa + "\n" +
                " con el Id de empleado: "+ ID +  ", actualmente tiene "+ experiencia + " años de experiencia.");



    }
}
