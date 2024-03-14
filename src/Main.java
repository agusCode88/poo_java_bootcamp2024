import cl.biilleteraVirtualBootcamp.clases.Cliente;
import cl.biilleteraVirtualBootcamp.clases.Cuenta;
import cl.biilleteraVirtualBootcamp.clases.CuentaEnDolares;
import cl.biilleteraVirtualBootcamp.clases.CuentaEnPesos;
import cl.billeteraVirtualBootcamp.interfaces.MonedaCambioInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double cantidadDolares=10;
        // Crear un array de Figuras que puede contener diferentes tipos de figuras
        MonedaCambioInterface[] cambiosMonedas = new MonedaCambioInterface[3];
        ArrayList<MonedaCambioInterface> cambiosMonedas2 = new ArrayList<>();

        //Cliente cliente = Cliente.crearClienteDesdeConsola();
        //cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

        System.out.println("Ingrese la cantidad de dólare que quiere depositar: ");
        CuentaEnDolares dolares = new CuentaEnDolares(10);



        cambiosMonedas[0] = dolares;
        cambiosMonedas2.add(dolares);

        for (MonedaCambioInterface cambio : cambiosMonedas) {
            System.out.println("Va a depositar "+  cantidadDolares+ ",equivalentes a:"+ cambio.conversorDemoneda(cantidadDolares)+ "Pesos Chilenos");
        }

    }
}