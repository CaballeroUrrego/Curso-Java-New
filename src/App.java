public class App {
        public static void main(String[] args) throws Exception {

                Persona persona1 = new Persona("pedro", "Pascal", 60);
                persona1.setNombre("Ricardo");
                persona1.setApellido("Darin");
                // persona 1
                // System.out.println(persona1.darNombreCompleto() + ", " + "tiene "
                // + persona1.Edad + " años");
                System.out.println(persona1.darNombreCompleto() + ", " + "tiene " + persona1.getEdad() + " años");
        }

}