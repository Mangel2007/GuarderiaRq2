import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();

        while (true) {
            String[] options = {"Agregar Estudiante", "Mostrar Estudiantes", "Mostrar Mayores de 5 años", "Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (eleccion == 0) {
                String id = JOptionPane.showInputDialog("Ingrese ID:");
                String nombre = JOptionPane.showInputDialog("Ingrese Nombre:");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad:"));
                String genero = JOptionPane.showInputDialog("Ingrese Género:");
                String documento = JOptionPane.showInputDialog("Ingrese Documento de Identidad:");
                String alergias = JOptionPane.showInputDialog("Ingrese Alergias:");
                String nombreAcudiente = JOptionPane.showInputDialog("Ingrese Nombre del Acudiente:");
                String numAcudiente = JOptionPane.showInputDialog("Ingrese Número de Contacto del Acudiente:");

                Estudiante nuevoEstudiante = new Estudiante(id, nombre, edad, genero, documento, alergias, nombreAcudiente, numAcudiente);
                guarderia.agregarEstudiante(nuevoEstudiante);
            } else if (eleccion == 1) {
                guarderia.mostrarListaEstudiantes();
            } else if (eleccion == 2) {
                guarderia.mostrarMayoresDeCinco();
            } else {
            }
        }
    }
}
