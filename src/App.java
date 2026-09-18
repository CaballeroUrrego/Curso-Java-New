public class App {
        public static void main(String[] args) throws Exception {
                Persona persona1 = new Persona();
                persona1.Nombre = "Leonardo";
                persona1.Apellido = "Dicaprio";
                persona1.Edad = 25;
                // Carrera de Leonardo
                Carrera carrera1 = new Carrera();
                carrera1.nombre = "Ingenieria en computacion";
                carrera1.duracion = 6;
                carrera1.estaEnCurso = false;

                persona1.carrera = carrera1;
                // Creación del segundo objeto independiente (persona2)
                Persona persona2 = new Persona();
                persona2.Nombre = "Mariana";
                persona2.Apellido = "Alvarez";
                persona2.Edad = 46;
                // Carrera de Mariana
                Carrera carrera2 = new Carrera();
                carrera2.nombre = "Ingenieria en sistemas";
                carrera2.duracion = 6;
                carrera2.estaEnCurso = true;
                persona2.carrera = carrera2;
                String saludado = " Desarollador Urrego";
                // Invocación del método darNombreCompleto() y lectura de atributos

                // persona 1
                System.out.println(persona1.darNombreCompleto() + ", " + "tiene " + persona1.Edad + " años y esta recibido de " + persona1.carrera.nombre);
                // persona 2
                System.out.println(persona2.darNombreCompleto() + ", " + "tiene " + persona2.Edad
                                + " años y eta cursando " + persona2.carrera.nombre);

                // System.out.println(persona1.enviarSaludo(saludado));
                // System.out.println(persona2.enviarSaludo(" Desarollador"));

        }

}