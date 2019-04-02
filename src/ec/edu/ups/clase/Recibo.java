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
public class Recibo {
    private String nombreCl;
    private int telefono;
    private double total;
    
    //to String
    @Override    
    public String toString() {
        return "Recibo{" + "nombreCl=" + nombreCl + ", telefono=" + telefono + ", total=" + total + '}';
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
