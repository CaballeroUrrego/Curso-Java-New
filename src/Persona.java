public class Persona {
  // Atributos y caracterizticas de un objeto
  // private hace que los atributos sean privados y solo se puedan acceder desde
  // la clase
  private String Nombre;
  private String Apellido;
  private int Edad;

  // Constructor
  public Persona(String nombre, String apellido, int edad) {
    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Edad = edad;

  }

  // Metodos Son los comportamientos de un objeto

  public String darNombreCompleto() {
    // return Apellido + ", " + Nombre;
    return getApellido() + ", " + getNombre();

  }

  public String enviarSaludo(String saludado) {
    if (Edad > 40)
      return "Buenos dias,querido" + saludado;
    return "Hola, ¿como estas" + saludado + "?";
  }

  // Getters y Setters //Sirven para obtener y modificar el valor de un atributo
  // privado
  // Forma manual de obtener el valor de un atributo privado
  // Getters
  public int getEdad() {
    return this.Edad;
  }

  public String getNombre() {
    return this.Nombre.toUpperCase();
  }

  public String getApellido() {
    return this.Apellido.toUpperCase();
  }

  // Setters
  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.Apellido = apellido;
  }

}
