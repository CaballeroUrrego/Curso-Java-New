public class Persona {
  // Atributos y caracterizticas de un objeto
  String Nombre;
  String Apellido;
  int Edad;
  // Clase carrera es decir un atributo
  Carrera carrera;

  // Constructor
  // los constructores son bloques de codigo que permiten inicializar los
  // atributos de la clase al momento de crear un objeto.
  // tienen el mismo nombre de la clase
  /*------------------------------------------------------ */
  // this :Se utiliza para acceder a variables de instancias o metodos de las
  // clases actuales y puede ser util para referirse a las propiedades propias de
  // la clase actual osea variables de instancia o de clase, si no se usa se puede
  // crear variables con el mismo nombre que los parametros de entrada sin generar
  // confunsion

  public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera,
      boolean estaEnCurso) {
    carrera = new Carrera(nombreCarrera, duracionCarrera, estaEnCurso);
    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Edad = edad;

  }

  // tambien podemos hacer un constructor que reciba mucho menos parameros
  // esto es una sobrecarga de constructor con el mismo nombre pero que tenga
  // comportamientos distintos
  public Persona(String nombre, String apellido, int edad, String nombreCarrera) {
    carrera = new Carrera(nombreCarrera);
    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Edad = edad;

  }

  // Metodos Son los comportamientos de un objeto

  public String darNombreCompleto() {
    return Apellido + ", " + Nombre;
  }

  public String enviarSaludo(String saludado) {
    if (Edad > 40)
      return "Buenos dias,querido" + saludado;
    return "Hola, ¿como estas" + saludado + "?";
  }

}
