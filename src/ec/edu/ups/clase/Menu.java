/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 * Menu Practica01-VintimillaDomenica
 * En esta clase se va a mostrar los productos que ofrece el restaurante al ciente
 * private-> Hacer un metodo privado
 * to String-> Para objetos String , el método toString devuelve una cadena que representa al objeto.
 * set-> Dar valores a las variables
 * get-> Obtener valores de las variables
 * this-> Dar un valor a una variable exacta 
 * return-> Retornar variables 
 */
public class Menu {
    
    private String nombreComida;
    private double precio;
    private String descripcion;
       
    //to String
    @Override    
    public String toString() {
        return "Menu{" + "Nombre de la Comida= " + nombreComida + ", Precio= " + precio + ", Descripcion= " + descripcion + '}';
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
