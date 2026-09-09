public class App {
    public static void main(String[] args) throws Exception {
        /*
*  /\_/\  
* ( o.o )  < Lucius.Java
*  > ^ <   < Caballero Urrego Dev 07/09/2026
*
*/
       String texto = "    Este es un texto asignado a una variable String   ";
       System.out.println(texto);
/*
*Cuenta los carracteres de la longitud de la cadena de texto
*/
int longitud = texto.length();
System.out.println("La longitud del texto es: " + longitud);

/*
*Obtiene el primer carácter de la cadena de texto
*/
char caracter = texto.charAt(0);
System.out.println("El primer carácter del texto es: " + caracter);


/*
* Ejemlo desde donde hasta donde va a ser cortada la cadena de texto
*/
String subcadena = texto.substring(5, 16);

System.out.println("La subcadena del texto es: " + subcadena);
        /*
*  /\_/\  
* ( o.o )  < Lucius.Java
*  > ^ <   < Caballero Urrego Dev 07/09/2026
*-convierte la cadena de texto a minúsculas
*/
String minusculo = texto.toLowerCase();
System.out.println("El texto en minúsculas es: " + minusculo);

        /*
*  /\_/\  
* ( o.o )  < Lucius.Java
*  > ^ <   < Caballero Urrego Dev 07/09/2026
*-convierte la cadena de texto a MAYUSCULAS
*/
String mayuscula = texto.toUpperCase();
System.out.println("El texto en mayúsculas es: " + mayuscula);

/*Buscar cual es el índice de un carácter específico */
int indice = texto.indexOf("variable");
System.out.println(indice);
/*Remplazamos la palabra "texto" por "parrafo" */
String reemplazado = texto.replace("texto", "parrafo");
System.out.println(reemplazado);

/* Verificar si la cadena de texto contiene una palabra específica */
boolean contiene = texto.contains("asignado");
System.out.println("El texto contiene la palabra 'asignado': " + contiene);

String sinEspacios = texto.trim();
System.out.println("El texto sin espacios es: " + sinEspacios);


    }
}