public class Animal {

  String nombre;
  int edad;
static int contadorAnimales = 0;

public Animal(String nombre , int edad){
    this.nombre = nombre;
    this.edad = edad;
    contadorAnimales++;
  
  }

public String hacerSonido(){
    return "grrr";
  }
public static int getContadorAnimales() {
    return contadorAnimales;
  }


}
