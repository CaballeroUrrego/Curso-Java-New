package EXCEPTIONS;

public class DividirPorCeroException extends Exception {

  @Override
  public String getMessage() {
    return "No se puede dividir por cero.";
  }
}
