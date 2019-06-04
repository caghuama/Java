import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre o nombres?");
        String apellidos = JOptionPane.showInputDialog("¿Cuales son tus apellidos?");



        //Pruebas para repo de github

        String apellido_pat ="Romero";
        String apellido_mat ="Garcia";
        int experiencia = 2;
        String ocupacion = "Consultor";
        String empresa = "MopegaTI";
        int ID = 31241;


        JOptionPane.showMessageDialog(null,
                "Buenas tardes Sr. "+ nombre +" "+ apellidos+ "\n" + "," +
                "la base de datos muestra que usted ocupa el puesto de: " + ocupacion + " en la Empresa: "+ empresa + "\n" +
                " con el Id de empleado: "+ ID +  ", actualmente tiene "+ experiencia + " años de experiencia.");



    }
}
