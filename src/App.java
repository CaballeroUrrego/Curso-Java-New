public class App {
        public static void main(String[] args) throws Exception {

                Persona persona1 = new Persona("pedro", "Pascal", 40, "Mandaloriano", 5, true);

                /*
                 * persona1.Nombre = "Patricio";
                 * persona1.Apellido = "Sosa";
                 * persona1.Edad = 60;
                 * // Carrera de Leonardo
                 * persona1.carrera.nombre = "Musica";
                 */

                // persona 1
                System.out.println(persona1.darNombreCompleto() + ", " + "tiene " + persona1.Edad
                                + " años y esta recibida de " + persona1.carrera.nombre);

        }

}