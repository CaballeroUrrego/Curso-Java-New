import interfaces.Alimetable;
import interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimetable {

  int cantTentaculos;

  public Pulpo(String nombre, int cantTentaculos) {
    super(nombre);
    this.cantTentaculos = cantTentaculos;
  }

  @Override
  public void nadar() {

    System.out.println(nombre + " esta nadando Con sus " + cantTentaculos + " tentaculos ");
  }

  @Override
  public void comunicarse() {

    System.out.println(nombre + " Saluda con sus " + cantTentaculos + " tentaculos ");
  }

  @Override
  public void alimentar() {

    System.out.println("Estamos alimentando con peces a  " + nombre);
  }

}
