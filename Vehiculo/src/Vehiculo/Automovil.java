
package Vehiculo;

import java.util.Scanner;


class Automovil extends Vehiculo {
    int numPuertas;

    public Automovil(int numPuertas, int numRuedas, int velMax) {
        super(numRuedas, velMax);
        this.numPuertas = numPuertas;
    }

   

    void acelerar() {
        System.out.println("Acelerando el automóvil. Velocidad actual: " + velocidadMaxima + " km/h");
    }
}
