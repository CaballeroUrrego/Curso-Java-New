import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                // Juego de consola:nos permitira escribir y en base se tomara cierta decision
                Scanner scanner = new Scanner(System.in);

                System.out.println("Bienvenido a la maquina expendedora de bebidas");
                System.out.println("Elegir una opcion de las Siguientes:");
                System.out.println("1 - cafe");
                System.out.println("2 - Mate");
                System.out.println("3 - Gaseosa");
                System.out.println("4 - vino");

                int opcion = scanner.nextInt();

               
                switch (opcion) {
                        case 1:
                                System.out.println("Me gusta el café");
                                break;
                        case 2:
                                System.out.println("Debes ser Argentino,uruguayo o paraguayo");
                                break;
                        case 3:
                                System.out.println("Me gusta la gaseosa");
                                break;
                        case 4:
                                System.out.println("Si tomaste vino no manejes porfavor");
                                break;
                        default:
                                System.out.println("Opcion no valida Fin del programa ");
                                break;
                }
System.out.println("Disfrute de su bebida");
scanner.close();


                // Que tipo de bebida te gusta :Switch
               /*  String bebida = "café";
                switch (bebida) {
                        case "café":
                                System.out.println("Me gusta el café");
                                break;
                        case "Mate":
                                System.out.println("Debes ser Argentino,uruguayo o paraguayo");
                                break;
                        case "Gaseosa":
                                System.out.println("Me gusta la gaseosa");
                                break;
                        case "vino":
                                System.out.println("Si tomaste vino no manejes porfavor");
                                break;
                        default:
                                System.out.println("Disfruta de tu bebida");
                                break;
                }*/


                /*
                 * if (bebida == "café") {
                 * System.out.println("Me gusta el café");
                 * } else if (bebida == "Mate") {
                 * System.out.println("Debes ser Argentino,uruguayo o paraguayo");
                 * } else if (bebida == "Gaseosa") {
                 * System.out.println("Me gusta la gaseosa");
                 * } else if (bebida == "vino") {
                 * System.out.println("Si tomaste vino no manejes porfavor");
                 * } else {
                 * System.out.println("Disfruta de tu bebida");
                 * }
                 */

        }
}