import java.text.NumberFormat;
import java.util.Scanner;

public class cajeroBancario {
    public static void main(String[] args) {
        String nombre = "Bartolo de la Rosa Rivera";
        String tipoDeCuenta = "Corriente";
        double saldoInicial = 30900;
        double saldo=0;
        int opcion = 0;
        double totalRetiro=0;
        double totalIngreso=0;
        double valorARetirar=0;
        double valorADepositar=0;
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();



        System.out.println("*****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + defaultFormat.format(saldoInicial));
        System.out.println("\n*****************************************");

        //Fin de la primera parte Iniciando los valores de la cuenta

        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4-Resumen Movimiento
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

         //Fin de la segunda parte montando el menú de opciones


            switch (opcion){
                case 1:
                    System.out.println("*****************************************");
                    if (saldo>0){
                        System.out.println("El saldo actualizado es: " +  defaultFormat.format(saldo));
                    }else{
                        System.out.println("El saldo actualizado es: " +  defaultFormat.format(saldoInicial));
                    }

                    System.out.println("\n*****************************************");
                    break;
                case 2:
                    System.out.println("*****************************************");
                    System.out.println("Cuál es el valor que deseas retirar?");
                     valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldoInicial){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldoInicial - valorARetirar;
                        System.out.println("Saldo restante: " + defaultFormat.format(saldo));
                    }
                    System.out.println("\n*****************************************");
                    break;
                case 3:
                    System.out.println("*****************************************");
                    System.out.println("Cuál es el valor que vas a depositar?");
                     valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: "+ defaultFormat.format(saldo ));
                    System.out.println("\n*****************************************");
                    break;
                case 4:
                    System.out.println("*****************************************");
                    System.out.println("RESUMEN DE MOVIMIENTOS");
                    System.out.println("El saldo Inicial es: "+ defaultFormat.format(saldoInicial ));
                    totalRetiro  += valorARetirar;
                    System.out.println("(-)Total Retiro es: "+defaultFormat.format(totalRetiro));
                    totalIngreso  += valorADepositar;
                    System.out.println("(+)Total Ingreso es: "+defaultFormat.format(totalIngreso));
                    System.out.println("El saldo Final es: "+defaultFormat.format(saldo));
                    System.out.println("\n*****************************************");
                    break;

                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }
        }

        //Fin de la tercera parte implementando los cálculos
    }
}