package cl.billeteraVirtualBootcamp.interfaces;

/**
 * Con las interfaces se puede simular una herencia múltiple al
 * tener multiples comportamientos. Esto es útil cuando una clase
 * necesita cumplir con varios contratos diferentes.
 *
 * Las interfaces son simplemente contratos que especifican métodos que deben ser implementados,
 * sin preocuparse por la implementación en sí.
 * Esto promueve un bajo acoplamiento entre las clases.
 *
 * Las interfaces permiten el polimorfismo, lo que significa que una referencia de tipo de interfaz
 * puede apuntar a objetos de diferentes clases que implementan esa interfaz.
 * Esto permite escribir código genérico que puede trabajar con diferentes tipos de objetos.
 *
 */
   public interface MonedaCambioInterface {
       double conversorDemoneda(double valorALaCuenta);

}
