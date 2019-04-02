/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 */
public class Inventario {
    private int plato;
    private int cubierto;
    private int mesa;
    
    //to String
    @Override    
    public String toString() {
        return "Inventario{" + "plato=" + plato + ", cubierto=" + cubierto + ", mesa=" + mesa + '}';
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
        return this.plato;
    }

    public int getCubierto() {
        return this.cubierto;
    }

    public int getMesa() {
        return this.mesa;
    }
    
}
