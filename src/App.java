
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenido a la fiesta de los superheroes");
        // Set<String> superHeroes = new HashSet<>(); // HashSet no tiene orden
        // Set<String> superHeroes = new TreeSet<>(); // TreeSet tiene orden alfabetico
        // Set<String> superHeroes = new LinkedHashSet<>(); // LinkedHashSet mantiene el
        // orden en el cual se agregaron
        List<String> superHeroes = new Vector<>(); // ArrayList mantiene el orden en el cual se agregaron permite
                                                      // duplicados
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("Catwoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");
        // Despues llego tarde nuestro Superherue esptrella
        superHeroes.add("Iron Man");

        if (superHeroes.contains("Spiderman")) {
            System.out.println("Spiderman esta el la fiesta");
        }
        System.out.println("¿hay un superherue que ya esta borracho el super heroe es " + superHeroes.get(0));
        superHeroes.set(6, "Tony Stark");
        System.out.println("Iron man se saca el traje mostrando su verdadera forma  " + superHeroes.get(6));
        // superHeroes.remove("Hulk");
        superHeroes.remove(3);
        if (!superHeroes.contains("Hulk")) {
            System.out.println("Hulk Se ha ido de la fiesta");
        }
        // fue y volvio a la tienda que no nos dimos cuenta que se fue
        /*
         * superHeroes.add("Superman");
         * superHeroes.add("Superman");
         * superHeroes.add("Superman");
         */

        if (superHeroes.isEmpty()) {
            System.out.println("La fiesta ha terminado todos se han ido");
        } else {
            System.out.println("La fiesta continua aun hay " + superHeroes.size() + " superheroes ");
        }
        System.out.println("¿Quienes estan aun en la fiesta? ");
        for (String superHero : superHeroes) {
            System.out.println(superHero);
        }

    }
}