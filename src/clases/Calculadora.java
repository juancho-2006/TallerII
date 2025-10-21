package clases;

public class Calculadora {
    private int a;
    private int b;

    //inicializacion  de atributos(constructor)
    public Calculadora(int numero1, int numero2) {
        this.a = numero1;
        this.b = numero2;

    }

    // clase dividir con su respectivo manejo de errores
    public void dividir() {
        try {
            int r = a / b;
            System.out.println(r);
        } catch (ArithmeticException e) {
            System.out.println("No se puede divir por cero  " + e);// e es para que muestre cual es el error;
        }
    }
}