import EXCEPTIONS.CalculadoraException;
//import EXCEPTIONS.DividirPorCeroException;

public class App {
    public static void main(String[] args) throws Exception {

        // --- CÓDIGO ACTIVO ---
        int numero1 = 10;
        // int numero2 = 0; // Esto va despues de la Excepcion
        int numero2 = 0; // Para que no salte la excepcion
        int resultado;
        Calculadora calculadora = new Calculadora();

        try {

            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);
        } catch (CalculadoraException e) {
            System.out.println(e.getDescripcion());
        } finally {
            System.out.println("Hemos finalizado el calculo ya sea exitoso o no");
        }
    }
}