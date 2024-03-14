import cl.biilleteraVirtualBootcamp.clases.Cliente;
import cl.biilleteraVirtualBootcamp.clases.Cuenta;
import cl.biilleteraVirtualBootcamp.clases.CuentaEnDolares;
import cl.biilleteraVirtualBootcamp.clases.CuentaEnPesos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double cantidadDolares=10;

        //Cliente cliente = Cliente.crearClienteDesdeConsola();
        //cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

        System.out.println("Ingrese la cantidad de dólare que quiere depositar: ");
        CuentaEnDolares dolares = new CuentaEnDolares();
        dolares.conversorDemoneda(10);

        System.out.println("Va a depositar "+  cantidadDolares+ ",equivalentes a:"+ dolares.conversorDemoneda(cantidadDolares)+ "Pesos Chilenos");


    }
}