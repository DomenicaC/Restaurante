/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clase.Informacion;
import ec.edu.ups.clase.Inventario;
import ec.edu.ups.clase.Menu;
import ec.edu.ups.clase.Parqueo;
import ec.edu.ups.clase.Recibo;

/**
 *
 * @author Domenica Cañizares
 */
public class Prueba {
    public static void main(String[] args){
        
        //set and get
        System.out.println("Set and Get"+"\n");
        
        //Informacion 
        Informacion info = new Informacion();
        info.setNombre("CHIFA");
        info.setDireccion("Eloy Alfaro y Av. de las Americas");
        info.setTelefono(4687926);
        
        System.out.println("Informacion del Rewstaurante"+"\n");
        
        String nombre=info.getNombre();
        System.out.println("Nombre restaurante "+nombre);
        
        String dir=info.getDireccion();
        System.out.println("Direccion Restaurante "+dir);
        
        int telf=info.getTelefono();
        System.out.println("Telefono "+telf);
       
        //Recibo
        Recibo rec = new Recibo();
        rec.setNombreCl("Juan Perez");
        rec.setTelefono(4659317);
        rec.setTotal(10.45);
        
        System.out.println("Recibo"+"\n");
        
        String nom=rec.getNombreCl();
        System.out.println("Nombre Cliente "+nom);
        
        int tel=rec.getTelefono();
        System.out.println("Telefono Cliente "+tel);
        
        int tot=rec.getTelefono();
        System.out.println("Total a Pagar "+tot);
        
        //Parqueo
        Parqueo par = new Parqueo();
        par.setNombreC("Juan Perez");
        par.setCodigo(1);
        par.setMarcaV("Mazda");
        
        System.out.println("Parqueo"+"\n");
        
        String nomC=par.getNombreC();
        System.out.println("Nombre Cliente "+nomC);
        
        int codigo=par.getCodigo();
        System.out.println("Codigo CLiente "+codigo);
        
        String marca=par.getMarcaV();
        System.out.println("Marca Vehiculo "+marca);
        
        //Menu
        Menu menu = new Menu();
        menu.setNombreComida("Chaulafan");
        menu.setPrecio(8.50);
        menu.setDescripcion("Arroz con camarones con salsa china");
        
        System.out.println("Menu"+"\n");
        
        String nomCo=menu.getNombreComida();
        System.out.println("Nombre del Plato "+nomCo);
        
        double precio=menu.getPrecio();
        System.out.println("Precio "+precio);
        
        String desCo=menu.getDescripcion();
        System.out.println("Descripcion del Plato "+desCo);
        
        //Inventario
        Inventario inv = new Inventario();
        inv.setPlato(100);
        inv.setCubierto(100);
        inv.setMesa(25);
        
        System.out.println("Inventario"+"\n");
        
        int plato=inv.getPlato();
        System.out.println("Numero de Platos "+plato);
        
        int cub=inv.getCubierto();
        System.out.println("Numero de Cubiertos "+cub);
        
        int mesa=inv.getMesa();
        System.out.println("Numero de Mesas "+mesa);
        
        
        //to String
        System.out.println("to String"+"\n");
        
        //Informacion
        System.out.println("Informacion del Restaurante"+"\n");
        System.out.println();
       // System.out.println(Informacion+"\n");
    
        //Recibo
        System.out.println("Recibo"+"\n");
        //System.out.println(Recibo+"\n");
        
        //Parqueo
        System.out.println("Parqueo"+"\n");
        //System.out.println(parqueo+"\n");
        //Menu
        System.out.println("Menu"+"\n");
        //System.out.println(Menu+"\n");
        
        //Inventario
        System.out.println("Inventario"+"\n");
    }
}
