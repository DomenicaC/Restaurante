/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

//import = Traer una los valores de una clase a otra
import ec.edu.ups.clase.Informacion;
import ec.edu.ups.clase.Inventario;
import ec.edu.ups.clase.Menu;
import ec.edu.ups.clase.Parqueo;
import ec.edu.ups.clase.Recibo;
import java.util.Scanner;

/**
 *
 * @author Domenica Cañizares
 * Informcaion Practica01-VintimillaDomenica
 * En esta clase se va a almacenar variabels para la creacion para la estructura de la noticia
 * private-> Hacer un metodo privado
 * to String-> Para objetos String , el método toString devuelve una cadena que representa al objeto.
 * set-> Dar valores a las variables
 * get-> Obtener valores de las variables
 * this-> Dar un valor a una variable exacta 
 * return-> Retornar variables 
 */
public class Prueba {

    public static void main(String[] args) {

        //set and get
        //System.out.println("Set and Get" + "\n");

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("Bienvenido al Restaurante ´CHIFA´");

        while (!salir) {

            System.out.println("1. Información acerca del Restaurante");
            System.out.println("2. Parqueo");
            System.out.println("3. Menu");
            System.out.println("4. Inventario");
            System.out.println("5. Recibo");
            System.out.println("6. Salir");

            System.out.println("Elija una opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción Información");
                    //Informacion 
                    Informacion info = new Informacion();
                    info.setNombre("CHIFA");
                    info.setDireccion("Eloy Alfaro y Av. de las Americas");
                    info.setTelefono(4687926);
                    System.out.println("");

                    System.out.println("Informacion del Rewstaurante" + "\n");

                    String nombre = info.getNombre();
                    System.out.println("Nombre restaurante " + nombre);

                    String dir = info.getDireccion();
                    System.out.println("Direccion Restaurante " + dir);
//
                    int telf = info.getTelefono();
                    System.out.println("Telefono " + telf);
                    
                    System.out.println("to String" + "\n");
                    System.out.println("Informacion del Restaurante");
                    System.out.println(info.toString() + "\n");
                    
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción Parqueo");
                    //Parqueo
                    Parqueo par = new Parqueo();
                    par.setNombreC("Juan Perez");
                    par.setCodigo(1);
                    par.setMarcaV("Mazda");

                    System.out.println("Parqueo" + "\n");

                    String nomC = par.getNombreC();
                    System.out.println("Nombre Cliente " + nomC);

                    int codigo = par.getCodigo();
                    System.out.println("Codigo CLiente " + codigo);

                    String marca = par.getMarcaV();
                    System.out.println("Marca Vehiculo " + marca);
                    
                    System.out.println("to String" + "\n");
                    System.out.println("Parqueo");
                    System.out.println(par.toString() + "\n");
                    
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción Menú");
                    //Menu
                    Menu menu = new Menu();
                    menu.setNombreComida("Chaulafan");
                    menu.setPrecio(8.50);
                    menu.setDescripcion("Arroz con camarones con salsa china");

                    System.out.println("Menu" + "\n");
//
                    String nomCo = menu.getNombreComida();
                    System.out.println("Nombre del Plato " + nomCo);

                    double precio = menu.getPrecio();
                    System.out.println("Precio " + precio);

                    String desCo = menu.getDescripcion();
                    System.out.println("Descripcion del Plato " + desCo);
                    
                    System.out.println("to String" + "\n");
                    System.out.println("Menu");
                    System.out.println(menu.toString() + "\n");
                    
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción Infventario");
                    //Inventario
                    Inventario inv = new Inventario();
                    inv.setPlato(100);
                    inv.setCubierto(100);
                    inv.setMesa(25);

                    System.out.println("Inventario" + "\n");

                    int plato = inv.getPlato();
                    System.out.println("Numero de Platos " + plato);

                    int cub = inv.getCubierto();
                    System.out.println("Numero de Cubiertos " + cub);

                    int mesa = inv.getMesa();
                    System.out.println("Numero de Mesas " + mesa);
                    
                    System.out.println("to String" + "\n");
                    System.out.println("Inventario");
                    System.out.println(inv.toString() + "\n");
        //            
                    break;
                case 5:
                    System.out.println("Has seleccionado la opción Recibo");
                    //Recibo
                    Recibo rec = new Recibo();
                    rec.setNombreCl("Juan Perez");
                    rec.setTelefono(4659317);
                    rec.setTotal(10.45);

                    System.out.println("Recibo" + "\n");

                    String nom = rec.getNombreCl();
                    System.out.println("Nombre Cliente " + nom);

                    int tel = rec.getTelefono();
                    System.out.println("Telefono Cliente " + tel);

                    int tot = rec.getTelefono();
                    System.out.println("Total a Pagar " + tot);
                    
                    System.out.println("to String" + "\n");
                    System.out.println("Recibo");
                    System.out.println(rec.toString() + "\n");
                    
                    break;
                
                case 6:
                    System.out.println("Has seleccionado la opción Salir");
                    System.out.println("Gracias");
                    salir = true;
                    break;
                default:
                    System.out.println("Solo digite números entre 1 y 6");
            }

        }

    }

}
