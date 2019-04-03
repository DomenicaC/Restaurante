/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 * Inventario Practica01-VintimillaDomenica
 * En esta clase se va a almacenar el numero de cosas qeu tiene un restaurante
 * private-> Hacer un metodo privado
 * to String-> Para objetos String , el método toString devuelve una cadena que representa al objeto.
 * set-> Dar valores a las variables
 * get-> Obtener valores de las variables
 * this-> Dar un valor a una variable exacta 
 * return-> Retornar variables 
 */
public class Inventario {
    private int plato;
    private int cubierto;
    private int mesa;
    
    //to String

    @Override
    public String toString() {
        return "Inventario{" + "Plato= " + plato + ", Cubierto= " + cubierto + ", Mesa= " + mesa + '}';
    }
    
    //Set

    public void setPlato(int plato) {
        this.plato = plato;
    }

    public void setCubierto(int cubierto) {
        this.cubierto = cubierto;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
   
    
    //Get

    public int getPlato() {
        return plato;
    }

    public int getCubierto() {
        return cubierto;
    }

    public int getMesa() {
        return mesa;
    } 
}
