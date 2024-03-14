package cl.biilleteraVirtualBootcamp.clases;

import cl.billeteraVirtualBootcamp.interfaces.MonedaCambioInterface;

public class CuentaEnDolares implements MonedaCambioInterface {

    public static double VALOR_DOLAR= 966;
    double saldo;

    @Override
    public double conversorDemoneda(double valor) {

        this.saldo =  valor*VALOR_DOLAR;
        return this.saldo;
    }
}
