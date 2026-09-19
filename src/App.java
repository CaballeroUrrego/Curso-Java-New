public class App {
        public static void main(String[] args) throws Exception {

                //
                Animal animal = new Animal("Bestia ", 2000);
                Gato gato = new Gato("Lucius ", 4); // Gato hijo de animal
                Perro perro = new Perro("Firulais ", 3); // Perro hijo de animal

                System.out.println("El animal llamado: " + animal.nombre + "hace:");
                System.out.println(animal.hacerSonido());

                System.out.println("El gato llamado: " + gato.nombre + "hace:");
                System.out.println(gato.hacerSonido());

                System.out.println("El perro llamado: " + perro.nombre + "hace:");
                System.out.println(perro.hacerSonido());

        }

}