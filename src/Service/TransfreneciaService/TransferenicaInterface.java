package Service.TransfreneciaService;

import Domain.Caja;
import Domain.Producto;
import Domain.Tranferencia;

import java.util.ArrayList;

public interface TransferenicaInterface {


    void almacenarProductos(Tranferencia tranferencia, ArrayList<Producto> productos);
    void almacenarCaja(Caja caja,Tranferencia tranferencia);
    int totalPago(Tranferencia tranferencia);
    ArrayList<Producto> almacenarProducto(Producto producto,ArrayList<Producto> productos);
    void mostrarTicket(Tranferencia tranferencia);
    Tranferencia nuevaCompra();
}
