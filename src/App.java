
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;
//import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenido a nuestra verduleria (tienda de frutas y verduras)");
        // Map<String, Double> inventario = new HashMap<>();//No respeta el orden
        // Map<String, Double> inventario = new TreeMap<>(); // Nos lo ordenan por orden
        // alfabetico

        Map<String, Double> inventario = new LinkedHashMap<>(); // Este es el ordena con el cual lo hemos agregado
        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.95);
        inventario.put("Frutilla", 0.65);
        inventario.put("Pimiento", 0.77);
        System.out.println("Este es el inventario de frutas y verduras : ");

        // KeySet me da un conjunto con las frutas
        for (String fruta : inventario.keySet()) {
            // con el get puedo acceder al valor
            System.out.println(fruta + " : $" + inventario.get(fruta));

        }
        // String frutaBuscada = "Manzana";
        String frutaBuscada = "Frutilla";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta : " + frutaBuscada);

        if (inventario.containsKey(frutaBuscada)) {
            System.out.println(frutaBuscada + " esta en el inventario encantados le vendemos");
        } else {
            System.out.println("Lamentablemente nos quedamos sin " + frutaBuscada);
        }
        String sinStock = "Frutilla";
        inventario.remove(sinStock);
        System.out.println("Nos hemos quedado sin: " + sinStock);

        System.out.println("Este es el inventario actualizado : ");
        System.out.println("La cantidad de mercaderia es : " + inventario.size());
    }
}