import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

class Estudiante {
    private String id, nombre, genero, documentoIdentidad, alergias, nombreAcudiente, numAcudiente;
    private int edad;

    public Estudiante(String id, String nombre, int edad, String genero, String documentoIdentidad, String alergias, String nombreAcudiente, String numAcudiente) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numAcudiente = numAcudiente;
    }

    public String getId() { return id; }
    public int getEdad() { return edad; }
    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad + "\nGénero: " + genero + "\nDocumento: " + documentoIdentidad + "\nAlergias: " + alergias + "\nAcudiente: " + nombreAcudiente + "\nContacto: " + numAcudiente + "\n";
    }
}
