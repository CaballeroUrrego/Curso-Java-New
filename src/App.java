public class App {
        public static void main(String[] args) throws Exception {
                Persona persona1 = new Persona();
                persona1.Nombre = "Sebastian";
                persona1.Apellido = "Urrego";
                persona1.Edad = 25;
                // Voy a hacerlo con otra persona
                Persona persona2 = new Persona();
                persona2.Nombre = "Mariana";
                persona2.Apellido = "Perez";
                persona2.Edad = 24;
                // Impresión en consola
                System.out.println(persona1.darNombreCompleto() + "," + persona1.Nombre + " tiene " + persona1.Edad
                                + " años.");
                // System.out.println(persona1.Apellido + "," + persona1.Nombre + " tiene " +
                // persona1.Edad + " años.");
                // System.out.println(persona2.Apellido + "," + persona2.Nombre + " tiene " +
                // persona2.Edad + " años.");
                System.out.println(persona2.darNombreCompleto() + "," + persona2.Nombre + " tiene " + persona2.Edad
                                + " años.");
                System.out.println(persona1.enviarSaludo(" Desarollador"));
                System.out.println(persona2.enviarSaludo(" Desarolladora"));
        }
}