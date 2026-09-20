public class App {
    public static void main(String[] args) throws Exception {
        // Excepciones: Eventos que interrumpen el flujo normal de la aplicación.

        // --- PRUEBAS ANTERIORES (COMENTADAS) ---
        // int numero1 = 5;
        // int numero2 = 0;

        // double numero1 = 5; /* En este caso no va por el catch, pasa por el try. Si
        // la división es entre 0 va por el catch */
        // double numero2 = 2;
        // double resultado;

        // long numero1 = 5; /* En este caso no va por el catch, pasa por el try. Si la
        // división es entre 0 va por el catch */

        // --- CÓDIGO ACTIVO ---
        double numero1 = 10;
        int numero2 = 5;
        int resultado;

        // System.out.println(numero1/numero2);
        // System.out.println("Esto va despues de la excepcion");
        //
        // NOTA: Si ejecutas sin try-catch y hay un error (división por cero), la
        // terminal te mostrará:
        // Exception in thread "main" java.lang.ArithmeticException: / by zero at
        // App.main(App.java:8)
        // Y las líneas de abajo no se ejecutarán. La manera de manejarlo es con Catch.

        try {
            // resultado = numero1 / numero2;

            // OPERACIÓN: Casteamos double (numero1) a int para poder guardarlo en
            // 'resultado'
            resultado = (int) numero1 / numero2;
            System.out.println(resultado);

        } catch (Exception e) {
            // Si numero2 fuera 0, la división fallaría y saltaría a esta sección:
            // java.lang.ArithmeticException: / by zero at App.main(App.java:16)

            e.printStackTrace(); // Muestra el detalle del error en consola

            // Continúa la ejecución normal sin cerrar el programa bruscamente
            System.out.println("Esto va despues de la Excepcion");
        }
    }
}