// paque
package cl.praxis.desafio1;
import java.util.Scanner;

public class Fecha_desafio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int añoPersona1, añoPersona2, mesPersona1, mesPersona2, diaPersona1, diaPersona2;

        do {
            System.out.println();
            System.out.println("                            +--------------------------------------------+");
            System.out.println("                            |  " + "\u001B[34;1m" + "Bienvenido al 'DESAFIO - Quién es mayor'" + "\u001B[0m" + "  |");
            System.out.println("                            +--------------------------------------------+");

            System.out.println();
            System.out.println("\u001B[31m" + "                                  NOTA IMPORTANTE EN LA EJECUCION:" + "\u001B[0m");
            System.out.println("\u001B[31m" + "1)  Para una ejecucion corecta del programa se deben respectar los formatos de ingreso de datos." + "\u001B[0m");
            System.out.println("\u001B[31m" + "2)  Ingresar caracteres numericos delimitados con '/'." + "\u001B[0m");

            System.out.println();
            System.out.println("Ingresar la fecha de nacimiento para persona 1 en formato día/mes/año (por ejemplo, 01/01/2000):");
            String persona1 = scanner.nextLine();
            System.out.println("Ingresar la fecha de nacimiento para persona 2 en formato día/mes/año (por ejemplo, 01/01/2000):");
            String persona2 = scanner.nextLine();

            String diaStringPersona1 = persona1.substring(0, 2);
            String mesStringPersona1 = persona1.substring(3, 5);
            String añoStringPersona1 = persona1.substring(6);

            String diaStringPersona2 = persona2.substring(0, 2);
            String mesStringPersona2 = persona2.substring(3, 5);
            String añoStringPersona2 = persona2.substring(6);

            diaPersona1 = Integer.parseInt(diaStringPersona1);
            mesPersona1 = Integer.parseInt(mesStringPersona1);
            añoPersona1 = Integer.parseInt(añoStringPersona1);

            diaPersona2 = Integer.parseInt(diaStringPersona2);
            mesPersona2 = Integer.parseInt(mesStringPersona2);
            añoPersona2 = Integer.parseInt(añoStringPersona2);

            if (((diaPersona1 < 1) || (diaPersona1 > 31)) || ((diaPersona2 < 1) || (diaPersona2 > 31))) {
                System.out.println("El día ingresado no está en el rango válido (1-31) en siguiente formato DD/MM/AAAA.");
            } else if (((mesPersona1 < 1) || (mesPersona1 > 12) || (mesStringPersona1.length() != 2)) || ((mesPersona2 < 1) || (mesPersona2 > 12) || (mesStringPersona2.length() != 2))) {
                System.out.println("El mes ingresado no está en el rango válido (1-12)  en siguiente formato DD/MM/AAAA.");
            } else if ((añoPersona1 < 1) || (añoPersona2 < 1)) {
                System.out.println("El año ingresado debe ser mayor que 0.");
            } else {
                break;
            }

        } while (true);

        if (añoPersona1 > añoPersona2) {
            System.out.println("Persona 1 es mayor.");
        } else if (añoPersona1 == añoPersona2) {
            if (mesPersona1 > mesPersona2) {
                System.out.println("Persona 1 es mayor.");
            } else if (mesPersona1 == mesPersona2) {
                if (diaPersona1 > diaPersona2) {
                    System.out.println("Persona 1 es mayor.");
                } else if (diaPersona1 == diaPersona2) {
                    System.out.println("Tienen la misma edad.");
                }else {
                    System.out.println("Persona 2 es mayor.");
                }
            }else {
                System.out.println("Persona 2 es mayor.");
            }
        }else {
            System.out.println("Persona 2 es mayor.");
        }
    }
}