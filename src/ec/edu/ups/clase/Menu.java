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
public class Menu {
    
    private String nombreComida;
    private double precio;
    private String descripcion;
       
    //to String
    @Override    
    public String toString() {
        return "Menu{" + "nombreComida=" + nombreComida + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }

    //Set
    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    //Get
    public String getNombreComida() {
        return this.nombreComida;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
}
