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
public interface  Vehiculo {
    public int velocidad=0;
    
    default String apagar() {
        return "El vehiculo ha sido apagado";
    }
    default String prender() {
        return "El vehiculo ha sido prendido";
    }
    void frenar();
    void acelerar();
    void cambioMarcha();
}
