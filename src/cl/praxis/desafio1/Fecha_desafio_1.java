// Paquete del Proyecto.
package cl.praxis.desafio1;
// Importamos la clase Scanner para la recepción de datos desde el teclado.
import java.util.Scanner;

// La clase principal del programa con el método main.
public class Fecha_desafio_1 {
    public static void main(String[] args) {
        // Creación de un nuevo objeto Scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaración de las variables.
        int añoPersona1, añoPersona2, mesPersona1, mesPersona2, diaPersona1, diaPersona2;

        // Inicio de bucle do-while.
        do {
            // Instrucciones de impresion por pantalla.
            System.out.println();
            System.out.println("                            +--------------------------------------------+");
            System.out.println("                            |  " + "\u001B[34;1m" + "Bienvenido al 'DESAFIO - Quién es mayor'" + "\u001B[0m" + "  |");
            System.out.println("                            +--------------------------------------------+");

            System.out.println();
            System.out.println("\u001B[31m" + "                                 NOTA IMPORTANTE DURANTE LA EJECUCION:" + "\u001B[0m");
            System.out.println("\u001B[31m" + "1)  Para una ejecución correcta del programa, es importante respetar los formatos de ingreso de datos." + "\u001B[0m");
            System.out.println("\u001B[31m" + "2)  Ingresar caracteres numericos delimitados con '/'." + "\u001B[0m");

            System.out.println();
            System.out.println("Ingresar la fecha de nacimiento para persona 1 en formato día/mes/año (por ejemplo, 01/01/2000):");
            // Instrucción de captura de datos desde el teclado.
            String persona1 = scanner.nextLine();
            System.out.println("Ingresar la fecha de nacimiento para persona 2 en formato día/mes/año (por ejemplo, 01/01/2000):");
            String persona2 = scanner.nextLine();

            // Usando el método substring dividiremos los datos capturados en tres partes que corresponderán a
            // día, mes y año. Luego, los guardaremos como cadenas en variables separadas.
            String diaStringPersona1 = persona1.substring(0, 2);
            String mesStringPersona1 = persona1.substring(3, 5);
            String añoStringPersona1 = persona1.substring(6);

            String diaStringPersona2 = persona2.substring(0, 2);
            String mesStringPersona2 = persona2.substring(3, 5);
            String añoStringPersona2 = persona2.substring(6);

            // Con el método parseInt de la clase Integer realizaremos la conversión de tipo string a int,
            // es decir, de texto a números.
            diaPersona1 = Integer.parseInt(diaStringPersona1);
            mesPersona1 = Integer.parseInt(mesStringPersona1);
            añoPersona1 = Integer.parseInt(añoStringPersona1);

            diaPersona2 = Integer.parseInt(diaStringPersona2);
            mesPersona2 = Integer.parseInt(mesStringPersona2);
            añoPersona2 = Integer.parseInt(añoStringPersona2);

            // Usando un ciclo if, realizaremos algunas validaciones de los datos:
            // Rango del día que se encuentre entre 1 y 31,
            // Rango del mes que vaya de 1 a 12,
            // El año no acepta valores menores a 0.
            if (((diaPersona1 < 1) || (diaPersona1 > 31)) || ((diaPersona2 < 1) || (diaPersona2 > 31))) {
                System.out.println("El día ingresado no está en el rango válido (1-31) en siguiente formato DD/MM/AAAA.");
            } else if (((mesPersona1 < 1) || (mesPersona1 > 12) || (mesStringPersona1.length() != 2)) || ((mesPersona2 < 1) || (mesPersona2 > 12) || (mesStringPersona2.length() != 2))) {
                System.out.println("El mes ingresado no está en el rango válido (1-12)  en siguiente formato DD/MM/AAAA.");
            } else if ((añoPersona1 < 1) || (añoPersona2 < 1)) {
                System.out.println("El año ingresado debe ser mayor que 0.");
            } else {
                // Instrucción de salida del ciclo (break).
                break;
            }

        } while (true);

        // Proceso de comparación de los datos para determinar cuál de las dos personas es mayor.
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