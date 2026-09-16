public class Persona {
  // Atributos y caracterizticas de un objeto
  String Nombre;
  String Apellido;
  int Edad;

  // Metodos Son los comportamientos de un objeto
  public String darNombreCompleto() {
    return Apellido + "," + Nombre;
  }

  public String enviarSaludo(String saludado) {
    if(Edad < 40) return "Buenos dias , querido " + saludado;
    return "Hola ,¿Como estas" + saludado + "?";
  }

}
