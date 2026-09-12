public class App {
        public static void main(String[] args) throws Exception {
                // 12/09/2026 Estructuras de control interativas :while
                int contador = 1;

                while (contador <= 5) {
                        System.out.println(contador);
                        // una actualizacion de la variable para evitar un bucle infinito
                        contador++;
                }
                System.err.println(contador);
        }
}