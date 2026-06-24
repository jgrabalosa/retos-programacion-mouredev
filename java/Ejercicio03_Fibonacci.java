public class Ejercicio03_Fibonacci {
    public static void main(String[] args) {

        long numero = 0;
        long numero2 = 1;

        for (int i = 1; i <= 50; i++) {
            System.out.println(numero);

            long fib = numero + numero2;
            numero = numero2;
            numero2 = fib;
        }
    }
}