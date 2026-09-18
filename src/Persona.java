public class Persona {
  // Atributos y caracterizticas de un objeto
  String Nombre;
  String Apellido;
  int Edad;
  // Clase carrera es decir un atributo
  Carrera carrera;

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
