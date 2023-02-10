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
        Integer getOperando = 1;
        while (!operandoIsOk) {
            getOperando = EntradaSalida.numero("Introduce el operador: \n1 - Suma\n2 - Resta\n3 - Multiplicación\n4 - División\n5 - Raíz");
            try {
                operandoIsOk = Calculadora.comprobacion(getOperando);
            } catch (NullPointerException ex) {

            }

            if (!operandoIsOk) {
                System.out.println("Error en el operador introducido, por favor introduzca un valor válido para el operador.");
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
