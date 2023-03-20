
package Vehiculo;


    
    abstract class Vehiculo {
    int numRuedas;
    int velocidadMaxima;

    public Vehiculo(int numRuedas, int velMax) {
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velMax;
    }

    abstract void acelerar();
}


