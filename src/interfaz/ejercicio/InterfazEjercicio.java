/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.ejercicio;

/**
 *
 * @author clavi
 */
public class InterfazEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto_electrica moto = new Moto_electrica();
        System.out.println(moto.prender()+ " moto");
        moto.acelerar();
        moto.frenar();
        System.out.println(moto.apagar()+ " moto");
        
      
        
        Barco bar = new Barco();
        System.out.println(bar.prender()+ " barco");
        bar.acelerar();
        bar.frenar();
        System.out.println(bar.apagar()+ " barco");
        
          Carro car = new Carro();
        System.out.println(car.prender()+ " carro");
        car.acelerar();
        car.frenar();
        System.out.println(car.apagar()+ " carro");
        car.combustible_carga();
        car.combustible_carga("Super");
        car.combustible_carga(50, 10);
        
    }
    
}
