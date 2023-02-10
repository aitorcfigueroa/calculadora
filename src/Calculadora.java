/**
 * Librería para comprobar la validez de un operador y para calcular una operación.
 * @version 0.2
 * @author Aitor Couñago Figueroa
 */
public class Calculadora {
    /**
     * Opción de operador suma
     */
    public static final int SUMA = 1;
    /**
     * Opción de operador resta
     */
    public static final int RESTA = 2;
    /**
     * Opción de operador multiplicación
     */
    public static final int MULTIPLICACION = 3;
    /**
     * Opción de operador división
     */
    public static final int DIVISION = 4;

    /**
     * Opción de operador raíz
     */
    public static final int RAIZ = 5;

    /**
     * Comprobación del operador a utilizar
     * @param operador valor del operador para realizar la operación
     * @return true si el operador es válido, si no false
     */
    public static boolean comprobacion(int operador) {
        if (operador >= SUMA && operador <= RAIZ) {
            return true;
        }

        return false;
    }

    /**
     * Calculadora para sumas, restas, multiplicaciones y divisiones
     * @param num1 primer número de la operación
     * @param num2 segundo número de la operación o índice en la raíz
     * @param operador valor del símbolo para realizar la operación
     * @return el resultado de la operación a realizar o un mensaje de error
     */
    public static Float operacion(float num1, float num2, int operador) {
        switch (operador) {
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
            case RAIZ:
                try {
                    return (float) Math.pow(num1, 1/num2);
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
