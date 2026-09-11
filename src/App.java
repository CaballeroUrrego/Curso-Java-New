public class App {
        public static void main(String[] args) throws Exception {
                // Estructuras de control
                int edad = 70;

                if (edad > 18 && edad <= 60) {
                        System.out.print("Puedes entrar a la Disco");
                } else if (edad > 60) {

                        System.out.print("No puedes entrar ya que no es para mayores de 60 años");
                } else if (edad == 18) {
                        System.out.print("Tienes la edad justa para entrar a la Disco, No olvides tu identificación");

                } else {
                        System.out.print("No tienes edad para entrar a la Disco");

                }
        }
}