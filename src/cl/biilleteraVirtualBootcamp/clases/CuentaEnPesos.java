package cl.biilleteraVirtualBootcamp.clases;

import cl.billeteraVirtualBootcamp.interfaces.MonedaCambioInterface;

public class CuentaEnPesos implements MonedaCambioInterface {
    double saldo;

    @Override
    public double conversorDemoneda(double valor) {
        this.saldo =  valor;
        return this.saldo;
    }
}
