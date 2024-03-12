import cl.biilleteraVirtualBootcamp.clases.Cliente;
import cl.biilleteraVirtualBootcamp.clases.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = Cliente.crearClienteDesdeConsola();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();



    }
}