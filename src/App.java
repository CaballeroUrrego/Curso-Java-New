public class App {
        public static void main(String[] args) throws Exception {
                // 12/09/2026 Arreglos
                /*
                 * Arreglos :Estructuras de datos que tienen valores del mismo tipo
                 * estos valores se distribuyen secuencialmente en la mayoria y se puede acceder
                 * a ellos mediante un indice
                 * los Arreglos son tambien llamados vectores o matrices
                 */
                // Dato importante el indice se empieza a contar con 0
                // int[] numeros = new int[5];
                int[] numeros = { 10, 20, 30, 40, 50 };
                // char[] letras = new char[5];
                /*
                 * numeros[0] = 1;
                 * numeros[1] = 2;
                 * numeros[2] = 3;
                 * numeros[3] = 4;
                 * numeros[4] = 5;
                 */

                /*
                 * numeros[0] = 10;
                 * numeros[1] = 20;
                 * numeros[2] = 30;
                 * numeros[3] = 40;
                 * numeros[4] = 50;
                 */
                numeros[2] = 70;
                int indice = 0;
                // forEach :es un elemento de arreglos y variables
                for (int numero : numeros) {
                        System.out.println(numero);
                        System.out.println(indice);
                        indice++;
                }
                // tipo nombre indices
                // dato 0 1 2 3 4
                for (int index = 0; index < numeros.length; index++) {
                        System.out.println(numeros[index]);
                        System.out.println(index);
                }

                /*
                 * System.err.println(numeros[0]);
                 * System.err.println(numeros[1]);
                 * System.err.println(numeros[2]);
                 * System.err.println(numeros[3]);
                 * System.err.println(numeros[4]);
                 */
                // System.out.println(numeros.length);// para iterar el arreglo ir imprimiendo
                // los valores sin necesidad de hacerlo uno por uno
                String palabra = "Abecedario";
                System.out.println(palabra.length());// Abecedario tiene 10 letras
        }
}