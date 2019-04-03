/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 * Informcaion Practica01-VintimillaDomenica
 * En esta clase se va a mostrar la informacion fundamental de restaurante
 * private-> Hacer un metodo privado
 * to String-> Para objetos String , el método toString devuelve una cadena que representa al objeto.
 * set-> Dar valores a las variables
 * get-> Obtener valores de las variables
 * this-> Dar un valor a una variable exacta 
 * return-> Retornar variables 
 */
public class Informacion {
    private String nombre;
    private String direccion;
    private int telefono;
    
    //to String
    @Override    
    public String toString() {
        return "Informacion{" + "Nombre= " + nombre + ", Direccion= " + direccion + ", Telefono= " + telefono + '}';
    }

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //Get
    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
