import interfaces.Alimetable;
import interfaces.Comunicable;


public class Delfin extends CriaturasMarinas implements Comunicable,Alimetable{



public Delfin(String nombre) {
  super(nombre);
}
@Override
public void nadar(){
  
    System.out.println(nombre + " esta nadando en velicidad con su cola y saltando con su cola ");
}

@Override
public void comunicarse() {
  System.out.println(nombre+" Emite sonidos y chasquidos para comunicarse");
}
@Override
public void alimentar() {

  System.out.println( "le dimos de comer una galleta "+  nombre);
}



}
