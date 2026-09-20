
import EXCEPTIONS.CalculadoraException;

public class Calculadora {

  public int dividir(int dividendo, int divisor) throws CalculadoraException {

    if (divisor == 0)
      throw new CalculadoraException("/by zero");

    return dividendo / divisor;
  }
}
