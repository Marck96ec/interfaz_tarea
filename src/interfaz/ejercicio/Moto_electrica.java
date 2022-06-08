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
public class Moto_electrica implements  Vehiculo{
    
    public int velocidad;

    @Override
    public String apagar() {
        return Vehiculo.super.apagar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String prender() {
        return Vehiculo.super.prender(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void frenar() {
        for(int i=0; i < 70; i++){
            if(velocidad <=0){
                System.out.println("La behiculo se detuvo");
                break;
                
            }else{
                velocidad -=2;
                System.out.println("La velocidad actual es: "+ velocidad);
            }
        }
    }

    @Override
    public void acelerar() {
        for(int i=0; i < 70; i++){
            if(velocidad>=70){
                System.out.println("La velocidad llego a su limite");
                break;
            }else{
                velocidad +=2;
                System.out.println("La velocidad actual es: "+ velocidad);
            }
        }
    }

    @Override
    public void cambioMarcha() {
        
        System.out.println("La velocidad actual es: "+ velocidad *2);
    }
    
}
