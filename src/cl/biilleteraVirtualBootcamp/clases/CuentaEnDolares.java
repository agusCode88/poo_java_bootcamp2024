package cl.biilleteraVirtualBootcamp.clases;

import cl.billeteraVirtualBootcamp.interfaces.MonedaCambioInterface;

public class CuentaEnDolares implements MonedaCambioInterface {

    public static double VALOR_DOLAR= 966;
    double saldo;

    public CuentaEnDolares(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que viene por contrato desde la interface
     * sobrescribe la principal
     * @param valor a transformar en el programa
     * @return el valor de la moneda en dólares.
     *
     */
    @Override
    public double conversorDemoneda(double valor) {
        this.saldo =  valor*VALOR_DOLAR;
        return this.saldo;
    }
}
