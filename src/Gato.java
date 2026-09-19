

//Con esto especificams que gato hereda de animal
public class Gato extends Animal {


  public Gato(String nombre,int edad){
//con la palabra super estamos asignando la informacion heredada 
super(nombre,edad);
  }


  @Override // sobreescribir en ingles el comportamiento de un metodo padre
  public String hacerSonido(){
  return "Miau";
}
}
