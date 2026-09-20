public class App {
    public static void main(String[] args) throws Exception {

        Delfin  delfin = new Delfin ("Adolfina");
        
   Pulpo   pulpo = new Pulpo ("Gonsalez",8);
        delfin.comunicarse();
        delfin.nadar();
        delfin.alimentar();

        pulpo.comunicarse();
        pulpo.nadar();
        pulpo.alimentar();

        
        }

}