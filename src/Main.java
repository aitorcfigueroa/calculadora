public class Main {
    public static void main(String[] args) {
        // Se pide el primer número hasta que sea un número válido.
        Integer getNum1 = null;
        while (getNum1 == null) {
            getNum1 = EntradaSalida.numero("Introduce el primer número:");
            if (getNum1 == null) {
                System.out.println("Por favor, introduzca un número válido.");
            }
        }

        // Se pide el operador hasta que sea un operador válido.
        boolean operandoIsOk = false;
        String getOperando = "+";
        while (!operandoIsOk) {
            getOperando = EntradaSalida.entrada("Introduce el operador:");
            operandoIsOk = Calculadora.comprobacion(getOperando);

            if (!operandoIsOk) {
                System.out.println("Error en el operador introducido, por favor introduzca: '+' '-' '*' '/'");
            }
        }

        // Se pide el segundo número hasta que sea un número válido.
        Integer getNum2 = null;
        while (getNum2 == null) {
            getNum2 = EntradaSalida.numero("Introduce el segundo número:");
            if (getNum2 == null) {
                System.out.println("Por favor, introduzca un número válido.");
            }
        }

        // Se devuelve el resultado de la operación.
        Float resultado = Calculadora.operacion(getNum1, getNum2, getOperando);
        System.out.println("El resultado es " + resultado);
    }
}
