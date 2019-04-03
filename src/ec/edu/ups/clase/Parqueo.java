/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 * Parqueo Practica01-VintimillaDomenica
 * En esta clase se va a almacenar la informacion del parqueadero
 * private-> Hacer un metodo privado
 * to String-> Para objetos String , el método toString devuelve una cadena que representa al objeto.
 * set-> Dar valores a las variables
 * get-> Obtener valores de las variables
 * this-> Dar un valor a una variable exacta 
 * return-> Retornar variables 
 */
public class Parqueo {
    private int codigo;
    private String nombreC;
    private String marcaV;
    
    //to String
    @Override    
    public String toString() {
        return "Parqueo{" + "Codigo= " + codigo + ", Nombre Cliente= " + nombreC + ", Marca Vehiculo= " + marcaV + '}';
    }

    //Set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setMarcaV(String marcaV) {
        this.marcaV = marcaV;
    }
    
    //Get
    public int getCodigo() {
        return this.codigo;
    }

    public String getNombreC() {
        return this.nombreC;
    }

    public String getMarcaV() {
        return this.marcaV;
    }
    
}
