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
public class Parqueo {
    private int codigo;
    private String nombreC;
    private String marcaV;
    
    //to String
    @Override    
    public String toString() {
        return "Parqueo{" + "codigo=" + codigo + ", nombreC=" + nombreC + ", marcaV=" + marcaV + '}';
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
