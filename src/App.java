public class App {
        public static void main(String[] args) throws Exception {
                Persona persona1 = new Persona();
                persona1.Nombre = "Leonardo";
                persona1.Apellido = "Dicaprio";
                persona1.Edad = 25;
                // Creación del segundo objeto independiente (persona2)
                Persona persona2 = new Persona();
                persona2.Nombre = "Mariana";
                persona2.Apellido = "Alvarez";
                persona2.Edad = 46;

                String saludado = " Desarollador Urrego";
                // Invocación del método darNombreCompleto() y lectura de atributos

                // persona 1
                System.out.println(persona1.darNombreCompleto() + ", " + "tiene " + persona1.Edad + " años.");
                // persona 2
                System.out.println(persona2.darNombreCompleto() + ", " + "tiene " + persona2.Edad + " años.");
              
                System.out.println(persona1.enviarSaludo(saludado));
                System.out.println(persona2.enviarSaludo(" Desarollador"));
        }

}