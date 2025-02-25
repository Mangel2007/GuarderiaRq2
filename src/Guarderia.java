import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Guarderia {
    private List<Estudiante> listEstudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {

        listEstudiantes.add(estudiante);
    }

    public void mostrarListaEstudiantes() {
        StringBuilder lista = new StringBuilder("Lista de estudiantes:\n");
        for (Estudiante e : listEstudiantes) {
            lista.append(e.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    public void mostrarMayoresDeCinco() {
        StringBuilder lista = new StringBuilder("Estudiantes mayores de 5 años:\n");
        for (Estudiante listEstudiantes); {
            if (edad > 5) {
                lista.append(toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
