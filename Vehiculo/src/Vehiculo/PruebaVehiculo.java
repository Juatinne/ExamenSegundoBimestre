
package Vehiculo;

   public class PruebaVehiculo {
    
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Automovil(4, 180, 3);
        vehiculos[1] = new Motocicleta(true, 2, 150);
        vehiculos[2] = new Automovil(4, 110, 4);
        vehiculos[3] = new Motocicleta(false, 2, 120);
        for (Vehiculo a : vehiculos) {
            if (a instanceof Motocicleta) {
                a.acelerar();
            }

            for (Vehiculo m : vehiculos) {
                if (m instanceof Vehiculo) {
                    m.acelerar();
                }
            }
        }
    }
}
