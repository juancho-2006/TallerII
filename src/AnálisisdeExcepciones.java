class main {
    public static class Calculadora {
        private int a;
        private int b;

        public Calculadora(int numero1, int numero2) {
            this.a = numero1;
            this.b = numero2;

        }

        public void dividir() {
            try {
                int r = a / b;
                System.out.println(r);
            } catch (ArithmeticException e) {
                System.out.println("No se puede divir por cero  " + e);
                ;
            }
        }
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora(10, 0);
        c.dividir();

    }
}