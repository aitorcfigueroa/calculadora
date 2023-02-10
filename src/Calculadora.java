/**
 * Librería para comprobar la validez de un operador y para calcular una operación.
 * @version 0.1
 * @author Aitor Couñago Figueroa
 */
public class Calculadora {
    /**
     * Opción de operador suma
     */
    public static final char SUMA = '+';
    /**
     * Opción de operador resta
     */
    public static final char RESTA = '-';
    /**
     * Opción de operador multiplicación
     */
    public static final char MULTIPLICACION = '*';
    /**
     * Opción de operador división
     */
    public static final char DIVISION = '/';

    /**
     * Comprobación del operador a utilizar
     * @param operador símbolo para realizar la operación
     * @return true si el operador es válido, si no false
     */
    public static boolean comprobacion(String operador) {
        if (operador.charAt(0) == SUMA || operador.charAt(0) == RESTA || operador.charAt(0) == MULTIPLICACION || operador.charAt(0) == DIVISION) {
            return true;
        }

        return false;
    }

    /**
     * Calculadora para sumas, restas, multiplicaciones y divisiones
     * @param num1 primer número de la operación
     * @param num2 segundo número de la operación
     * @param operador símbolo para realizar la operación
     * @return el resultado de la operación a realizar o un mensaje de error
     */
    public static Float operacion(float num1, float num2, String operador) {
        switch (operador.charAt(0)) {
            case SUMA:
                try {
                    return num1 + num2;
                } catch (Exception ex) {
                    System.out.println("Error al sumar");
                    return null;
                }
            case RESTA:
                try {
                    return num1 - num2;
                } catch (Exception ex) {
                    System.out.println("Error al restar");
                    return null;
                }
            case MULTIPLICACION:
                try {
                    return num1 * num2;
                } catch (Exception ex) {
                    System.out.println("Error al multiplicar");
                    return null;
                }
            case DIVISION:
                try {
                    return num1 / num2;
                } catch (Exception ex) {
                    System.out.println("Error al dividir");
                    return null;
                }
            default:
                System.out.println("Error en la operación");
                return null;
        }
    }
}
