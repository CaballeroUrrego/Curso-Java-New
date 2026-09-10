public class App {
        public static void main(String[] args) throws Exception {
                /*
                 * Operadores : Simbolos que sirven para hacer operaciones con variables o
                 * valores
                 * Arimeticos :
                 */

                // int a = 5;
                // int b = 4;
                // int c = a + b;
                // int c = a - b;
                // int c = a * b;
                // int c = a / b; //5 dividio 4 No es uno es por que estamos usando enteros

                // System.out.println("El resultado de la Suma es: " + c);
                // System.out.println("El resultado de la resta es: " + c);
                // System.out.println("El resultado de la multiplicación es: " + c);
                // System.out.println("El resultado de la división es: " + c);//El resultado de
                // la división es: 1.0 esto No es correcto por que pusimos int y no double//

                // Vamos a probar con double
                // Funciona por que el dividendo y el divisor tienen que ser double para que el
                // resultado sea double
                // double a = 5;
                // double b = 4;
                // double c = a / b; //Funciona por que el dividendo y el divisor tienen que ser
                // double para que el resultado sea double
                // System.out.println("El resultado de la división es: " + c);//El resultado de
                // la división es: 1.0 esto No es correcto

                /*
                 * Si queremos saber si algo es par :
                 */
                // int a = 13;
                // int b = a %2;//El resto nos dice si es par o impar, si el resto es 0 es par y
                // si es 1 es impar
                // System.out.println("El resultado de la ecuacion es 0 es par y si es 1 es
                // impar : " + b);

                // Asignacion:

                // Declaración e inicialización: se crea la variable entera 'c' con valor
                // inicial 5
                // int c = 5;

                // Asignación simple (=): reemplaza el valor previo y asigna 10 a la variable
                // 'c'
                // c = 10;
                // Asignación con suma (+=): suma 15 al valor anterior (10 + 15), c pasa a valer
                // 25
                // c += 15;
                // Asignación con suma (+=): suma 25 al valor acumulado (25 + 25), c pasa a
                // valer 50
                // c += 25;
                // Asignación con resta (-=): resta 15 al valor acumulado (50 - 15), c pasa a
                // valer 35
                // c -= 15;
                // Asignación con multiplicación (*=): multiplica el valor acumulado por 2 (35 *
                // 2), c pasa a valer 70
                // c *= 2;
                // Asignación con división (/=): divide el valor acumulado entre 10 (70 / 10), c
                // pasa a valer 7
                // c /= 10;
                // Asignación con incremento y decremento: incrementa y decrementa el valor de
                // 'c' en 1
                // c++;
                // c++;
                // c--;
                // Muestra en la consola el valor final de 'c'
                // System.out.println("El resultado de la Asinacion es : " + c);

                // Operadores de Comparacion : Nos permiten comparar dos valores y nos devuelven
                // un valor booleano (true o false)
                /*
                 * int a =3;
                 * int b = 4;
                 * boolean esMayor = a > b;
                 * boolean esMenor = a < b;
                 * boolean esIgual = a == b;
                 * System.out.println(esMayor);
                 * System.out.println(esMenor);
                 * System.out.println(esIgual);//osea 3 no es igual a 4
                 */
//Operadores Logicos :Tablas de la verdad


boolean condicion1 = true;
boolean condicion2 = false;
boolean resultadoAnd = condicion1 && condicion2; //Ambos deben ser true para que el resultado sea true
boolean resultadoOr = condicion1 || condicion2; //uno de los dos debe ser positivo para que el resultado sea true
boolean resultadoNot = !condicion1;//lo opuesto a lo que tenga asignado previamente la variable condicion1
/*
 * TABLA DE LA VERDAD
 * AND          OR          NOT
 * 
 * _ | V | F     | V | F       NOT
 * V | V | F   V | V | V   V | !F
 * F | F | F   F | V | F   F | !V
 * 
 */
System.out.println(resultadoAnd); // false
System.out.println(resultadoOr); // true
System.out.println(resultadoNot); // false


        }
}