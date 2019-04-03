/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 * Recibo Practica01-VintimillaDomenica
 * En esta clase se va a almacenar los datos del cliente para su factura
 * private-> Hacer un metodo privado
 * to String-> Para objetos String , el método toString devuelve una cadena que representa al objeto.
 * set-> Dar valores a las variables
 * get-> Obtener valores de las variables
 * this-> Dar un valor a una variable exacta 
 * return-> Retornar variables 
 */
public class Recibo {
    private String nombreCl;
    private int telefono;
    private double total;
    
    //to String
    @Override    
    public String toString() {
        return "Recibo{" + "Nombre Cliente= " + nombreCl + ", Telefono= " + telefono + ", Total= " + total + '}';
    }

    //Set
    public void setNombreCl(String nombreCl) {
        this.nombreCl = nombreCl;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //Get
    public String getNombreCl() {
        return this.nombreCl;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public double getTotal() {
        return this.total;
    }
    
}
