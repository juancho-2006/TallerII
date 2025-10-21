package Apps;

import clases.Calculadora;
/*
programa con la logica corregida, Analisis de Excepciones corregido( nullpointer ->Arithmetic)
atributos inicializados y creacion de constructor para mayor orden y repasar
 */

public class cal {
    // main
    public static void main(String[] args) {
        Calculadora c = new Calculadora(10, 0);
        c.dividir();

    }
}
