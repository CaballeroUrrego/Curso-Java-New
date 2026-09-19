public class Perro extends Animal {

  public Perro(String nombre,int edad){
    //con la palabra super estamos asignando la informacion heredada 
    super(nombre,edad);
  }


  @Override // sobreescribir en ingles el comportamiento de un metodo padre
  public String hacerSonido(){
    return "Guau Guau ";
  }

  
}
