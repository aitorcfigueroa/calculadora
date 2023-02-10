import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 * @version 0.3
 * @author Damian Nogueiras
 * @author Aitor Couñago Figueroa
 */
public class EntradaSalida {
    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;

    /**
     * opción para introducir un dato de tipo String
     */
    public static final int CADENA = 1;

    /**
     * opción para introducir un dato de tipo int
     */
    public static final int NUMERO = 2;

    private void EntradaSalida(){};

    /**
     * Salida por ventana o consala de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null,"Sale por un ventana " + msj);
                    return true;
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }

    /**
     * Método para obtener una cadena por consola
     * @param comentario mensaje para pedir la introducción de una entrada por consola
     * @return el string introducido o null en caso de error
     */
    public static String entrada(String comentario){
        try {
            System.out.println(comentario);
            Scanner input = new Scanner(System.in);
            String respuesta = input.nextLine();
            return respuesta;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * Método para obtener un número por consola
     * @param comentario mensaje para pedir la introducción de una entrada por consola
     * @return el número introducido o null en caso de error
     */
    public static Integer numero(String comentario) {
        try {
            System.out.println(comentario);
            Scanner input = new Scanner(System.in);
            int respuesta = input.nextInt();
            return respuesta;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
