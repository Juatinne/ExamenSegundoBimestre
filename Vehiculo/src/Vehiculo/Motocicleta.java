
package Vehiculo;


 class Motocicleta extends Vehiculo {
    boolean tinecasco;

    public Motocicleta(boolean tinecasco, int numRuedas, int velMax) {
        super(numRuedas, velMax);
        this.tinecasco = tinecasco;
    }

    
    
      public void Motocicleta (){	
          System.out.println("Tiene casco");
         
          
      }
      public void Acelerar (){
          System.out.println("La velocidad maxima es: ");
          
          
      }

    @Override
    void acelerar() {
        
    }
}

