package Service.TransfreneciaService.impl;

import Domain.Caja;
import Domain.Producto;
import Domain.Tranferencia;
import Service.TransfreneciaService.TransferenicaInterface;

import java.util.ArrayList;

public class TransferenciaService implements TransferenicaInterface{

    @Override
    public void almacenarProductos(Tranferencia tranferencia, ArrayList<Producto> productos) {
        tranferencia.setProductos(productos);
    }

    @Override
    public void almacenarCaja(Caja caja, Tranferencia tranferencia) {
        tranferencia.setCaja(caja);
    }

    @Override
    public int totalPago(Tranferencia tranferencia) {
        int total = 0;
        for (int i = 0; i < tranferencia.getProductos().size(); i++) {
            total += tranferencia.getProductos().get(i).getPrecio();
        }
        return total;
    }

    @Override
    public ArrayList<Producto> almacenarProducto(Producto producto, ArrayList<Producto> productos) {
        productos.add(producto);
        return productos;
    }

    @Override
    public void mostrarTicket(Tranferencia tranferencia) {
        for (Producto producto : tranferencia.getProductos()){
            System.out.println(producto.getNombre() + " Canitdad: " + producto.getCantidad() + " $" + producto.getPrecio());
        }

    }

    @Override
    public Tranferencia nuevaCompra() {
        return new Tranferencia();
    }

}
