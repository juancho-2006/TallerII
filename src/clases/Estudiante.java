package clases;

import java.util.List;

public class Estudiante {
    public String nombre;
    public int id;
    public Double promedio;

    // Constructor inicializo los atributos
    public Estudiante(String nombre, int id, Double promedio) {
        this.nombre = nombre;
        this.id = id;
        this.promedio = promedio;
    }

    public void mostrarInf_Estu() {
        System.out.println("******************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Promedio: " + promedio);
        System.out.println("******************************");
    }

    public String toString() {
        return nombre + "," + id + "," + promedio;
    }

    public void calcularPromedio(List<Double> notas) {
        double suma = 0.0;

        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i);
        }

        if (!notas.isEmpty()) {
            promedio = suma / notas.size();
        } else {
            promedio = 0.0;
        }
    }
}