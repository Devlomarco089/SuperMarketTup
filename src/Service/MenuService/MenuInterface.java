package Service.MenuService;

import Domain.Caja;
import Domain.Producto;
import Domain.Tranferencia;

import java.util.ArrayList;

public interface MenuInterface {
    
    void inicioSuper(ArrayList<Caja> cajas, Tranferencia tranferencia,ArrayList<Producto> productos);
    void eleccionCaja(ArrayList<Caja> cajas,Tranferencia tranferencia);
    void mostrarProductos(ArrayList<Producto> lista);
    void eleccionProducto(ArrayList<Producto> lista, Tranferencia tranferencia);
    void mostrarTicket(Tranferencia tranferencia);
}
