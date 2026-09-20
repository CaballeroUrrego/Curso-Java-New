public abstract class CriaturasMarinas {

  // Atributo
  String nombre;

  public CriaturasMarinas(String nombre) {
    this.nombre = nombre;
  }
//Esto obliga a sobrescribir las clases que hereden de criaturas Marinas
  public abstract void nadar();

}
