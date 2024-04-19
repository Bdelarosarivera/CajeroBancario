import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido (a) a Screen Match");
        System.out.println("Pelicula: MAtrix");

        // Declaracion de variable con tipos de datos en Java

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 9.0 + 9.0) / 3;

        System.out.println(media);


        String sinopsis = """
                matrix es una paradoja
                la mejor pelicula del fin del mileneo
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion= (int) (media/2);
        System.out.println(clasificacion);


    }
}

    /*int valor =  5;  //Atribuye el valor 5 a la variable valor
    int valor =  10;
    valor += 15;  //Equivalente al valor = valor + 15, atribuye el valor 15 a la variable valor




    /*Operadores aritméticos:
    Los operadores aritméticos se utilizan para realizar operaciones matemáticas básicas. Estos son:
    "+" (adición)
    "-" (sustracción)
    "*" (multiplicación)
    "/" (división)
    "%" (módulo, resto de la división)*/

    /*int a = 10 + 5; // Atribuye el valor 15 a la variable a
    int b = 10 - 5; // Atribuye el valor 5 a la variable b
    int c = 10 * 5; // Atribuye el valor 50 a la variable c
    int d = 10 / 5; // Atribuye el valor 2 a la variable d
    int e = 10 % 3; // Atribuye el valor 1 a la variable ya que (el resto de la divición de 10 por 3 es 1)



    /*Operadores relacionales:
    Los operadores relacionales se utilizan para comparar valores. Devuelven un valor booleano (verdadero o falso). Trabajaremos más con ellos cuando lleguemos a la lección de condicionales, donde modificaremos el flujo de la aplicación en función de una condición. Estos son:
    "==" (igual a)
    "!=" (diferente de)
    ">" (mayor que)
    ">=" (mayor o igual que)
    "<" (menor que)
    "<=" (menor o igual que)*/

   // Ejemplo:
    /*int a = 10; // Atribui un valor 10 à variável a
    int b = 5; // Atribui un valor 5 à variável b
    int c = 30; // Atribui un valor 30 à variável c

    boolean igual = (b == a); //En este caso la variable igual quedará con valor *false, pues el el valor de b no es igual al valor de a.
    boolean diferente = (b != c); //La variable diferente quedará con el valor de *true*, pues el valor de b es diferente del valor de c.
    boolean mayor= (b > a); //la variable mayor quedará con el valor *false*, pues el valor de b es menor que el valor de a.
    boolean menorIgual = (b <= c); //La variable menor igual quedará con el valor de *true*, pues el valor de b es menor que el valor de c.


   /* Operadores lógicos:
    Estos operadores se utilizan cuando queremos verificar dos o más condiciones y/o expresiones en una aplicación. Comparan valores booleanos y también devuelven un resultado booleano.
    Existen tres operadores: AND (&&), OR (||) y NOT (!).
    El operador AND (&&), también conocido como "y" en español, se utiliza para verificar si dos condiciones son verdaderas. Si ambas condiciones son verdaderas, el resultado será verdadero. De lo contrario, el resultado será falso.

    Aquí tienes un ejemplo:*/
    /*boolean a = true;
    boolean b = false;
    if (a && b) {

        // Este código no será ejecutado, ya que a es verdadero y b es falso
      //  El operador OR (||), conocido como "o" en español, se utiliza para verificar si al menos una de las condiciones es verdadera. Si al menos una de las condiciones es verdadera, el resultado será verdadero. De lo contrario, el resultado será falso.
        // Aquí tienes un ejemplo:*/



    /*boolean a = true;
    boolean b = false;
    if (a || b) {
        //Este código será ejecutado, ya que a es verdadero aunque b sea falso
    }

/*    Operadores de incremento
    Además de los operadores mencionados anteriormente, el operador de incremento se utiliza para aumentar el valor de una variable en 1. Hay dos tipos de operadores de incremento: el operador de pre-incremento (++variable) y el operador de post-incremento (variable++).
    El operador de pre-incremento (++variable) aumenta el valor de la variable en 1 antes de utilizarla en una expresión.
    Aquí tienes un ejemplo:*/

    /*int num = 5;
    int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
    System.out.println(num); // imprime 6
    System.out.println(resultado); // imprime 6*/





