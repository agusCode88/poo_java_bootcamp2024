import cl.biilleteraVirtualBootcamp.clases.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cuenta cuenta = new Cuenta();

        // Llenado la clase de datos

        cuenta.setNumeroCuenta(123456);
        cuenta.setTitularCuenta("Alexis Rebolledo");
        cuenta.setSaldoCuenta(50);

        System.out.println("Nombre del titular de la cuenta: " + cuenta.getTitularCuenta());

        cuenta.mostrarInformacionCuentaCorriente();

    }
}