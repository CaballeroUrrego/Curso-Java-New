import java.util.Scanner;

public class Ahorcado {

  public static void main(String[] args) throws Exception {
    // Clase Scaner que nos permite que el usurio escriba
    Scanner scanner = new Scanner(System.in);

    // Declaraciones y asignaciones de variables
    String PalabraSecreta = "inteligencia";
    int inteligencia = 10;
    int IntentosMaximos = 10;
    int Intentos = 0;
    boolean PalabraAdivinada = false;

    // Arreglos :
    char[] LetrasAdivinadas = new char[PalabraSecreta.length()];
    // Estructura de control :Iterativa (Bucle)
    for (int i = 0; i < LetrasAdivinadas.length; i++) {
      LetrasAdivinadas[i] = '_';

    }
    // Estructura de control :Iterativa (While)
    while (!PalabraAdivinada && Intentos < IntentosMaximos) {
      // Esto se usa cuando tenemos una palabra de chars
      System.out.println(
          "Palabra a adivinar : " + String.valueOf(LetrasAdivinadas) + "(" + PalabraSecreta.length() + "letras)");
      System.out.println("Introduce una letra, por favor");
      // Usamos la clase Scanner para poder obtener la entrada de datos del usuario
      char letra = Character.toLowerCase(scanner.next().charAt(0));

      boolean LetraCorrecta = false;
      // Estructura de control :Iterativa (Bucle)
      for (int i = 0; i < PalabraSecreta.length(); i++) {
        // Estructura de control Condicional
        if (PalabraSecreta.charAt(i) == letra) {
          LetrasAdivinadas[i] = letra;
          LetraCorrecta = true;

        }
      }
      if (!LetraCorrecta) {
        Intentos++;
        System.out.println("¡Incorrecto!  Te quedan " + (IntentosMaximos - Intentos) + " Intentos");
      }
      if (String.valueOf(LetrasAdivinadas).equals(PalabraSecreta)) {
        PalabraAdivinada = true;
        System.out.println("¡Felicidades! Has adivinado la palabra: " + PalabraSecreta);
      }
    }
    if (!PalabraAdivinada) {
      System.out.println("¡Has perdido! La palabra era: Game Over");
    }
    scanner.close();
  }

}
