public class App {
    public static void main(String[] args) throws Exception {
        /*
*  /\_/\  
* ( o.o )  < Lucius.Java
*  > ^ <   < Caballero Urrego Dev 
*
*/
        /*
         * Variable:
         * Este es un Espacio de memoria que tiene un Nombre asociado y puede contener
         * un valor cambiante
         *
         * Declaracion:
         * Asignar el tipo de dato y el nombre de dato y el nombre a la variable o no un
         * valor inicial.
         *
         * Asignacion:
         * Darle un valor a la variable.
         */
        /*
         * Tipos de variables:
         * Variables primitivas : Almacenan valores Basicos
         *
         * Variables de referencia: Almacena direciones de memoria que apuntan a un
         * objeto.
         */
        /*
         * Esto pasa por que:
         * java fue Creado en una epoca en la que casi no habia almacenamiento
         * suficiente osea los 90s y 2000s, por lo que se creo un lenguaje que no
         * consumiera muchos recursos y que fuera rapido, por eso se crearon los tipos
         * de datos primitivos, para ahorrar memoria y tiempo de procesamiento.
         */
        // Tipos de Datos Enteros : byte(-128 al 127), short(-32768 al 32767), int, long
        // Short : Funcionaria igual
        // short numero = 5;
        // byte :Funcionaria igual
        byte numero = 5;

        // Tipos de Datos Decimales : float, double
        // float decimales = 5.123456789f;// Solo alcanza a poner 6 demimales
        double decimales = 5.012345678901234567890; // Solo alcanza a poner 15 demimales

        // Tipo de Dato Caracter : char
        char Letra = 'S';

        // Tipo de datos Booleanos : Verdadero o Falso
        Boolean v = true;
        Boolean f = false;
        //String : Cadena de caracteres
        String cadena = "Hola Mundo";
        System.out.println("El valor de la variable numero es: " + numero);
        System.out.println("El valor de la variable decimales es: " + decimales);
        System.out.println("El valor de la variable Letra es: " + Letra);
        System.out.println("El valor de la variable v es: " + v);
        System.out.println("El valor de la variable f es: " + f);
        System.out.println("El valor de la variable cadena es: " + cadena);

    }
}