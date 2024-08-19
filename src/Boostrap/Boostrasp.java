package Boostrap;

import Domain.Caja;
import Domain.Empleado;
import Domain.Producto;
import java.util.ArrayList;

public class Boostrasp {
    public ArrayList<Producto> generarProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("Cerveza", 2900, 1);
        Producto producto2 = new Producto("Vino", 5800, 1);
        Producto producto3 = new Producto("Ron", 13800, 1);
        Producto producto4 = new Producto("Vodka", 11600, 1);
        Producto producto5 = new Producto("Papas Fritas", 3700, 1);
        Producto producto6 = new Producto("Cigarillos", 8200, 1);
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        return productos;
    }


    public ArrayList<Caja> generarCajas(){
        ArrayList<Caja> cajas = new ArrayList<>();
        Empleado empleado1 = new Empleado("Juan","Perez",1923344,300000);
        Empleado empleado2 = new Empleado("Pedro","Gonzales",8382833,300000);
        Empleado empleado3 = new Empleado("Maria","Fernandez",991912,300000);
        Caja caja1 = new Caja(empleado1,1);
        Caja caja2 = new Caja(empleado2,2);
        Caja caja3 = new Caja(empleado3,3);
        cajas.add(caja1);
        cajas.add(caja2);
        cajas.add(caja3);
        return cajas;
    }
}
