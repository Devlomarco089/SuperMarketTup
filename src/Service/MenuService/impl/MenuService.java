package Service.MenuService.impl;

import Domain.Caja;
import Domain.Producto;
import Domain.Tranferencia;
import Service.MenuService.MenuInterface;
import Service.ScannerService.Impl.ScannerService;
import Service.TransfreneciaService.impl.TransferenciaService;

import java.util.ArrayList;

public class MenuService implements MenuInterface{

    @Override
    public void inicioSuper(ArrayList<Caja> cajas,Tranferencia tranferencia,ArrayList<Producto> productos) {
        System.out.println("Bienvendios a SumperMarketTup");
        eleccionCaja(cajas,tranferencia);
        mostrarProductos(productos);
        eleccionProducto(productos,tranferencia);
        mostrarTicket(tranferencia);
    }

    @Override
    public void eleccionCaja(ArrayList<Caja> cajas,Tranferencia tranferencia) {
        TransferenciaService ts = new TransferenciaService();
        ScannerService sc = new ScannerService();
        for (Caja caja : cajas) {
            System.out.println("-------------------------------------------------");
            System.out.println("Caja: " + caja.getNroCaja());
            System.out.println("Empleado : " + caja.getEmpleado().getNombre() + caja.getEmpleado().getApellido());
            System.out.println("-------------------------------------------------");
        }
        System.out.println("Eleccion numero de caja: ");
        int eleccion = sc.leerSiguiente();
        ts.almacenarCaja(cajas.get(eleccion-1),tranferencia);

    }

    @Override
    public void mostrarProductos(ArrayList<Producto> lista) {
        int i = 1;
        for (Producto producto : lista) {
            System.out.println(i + " " + producto);
            i++;
        }
    }

    @Override
    public void eleccionProducto(ArrayList<Producto> lista, Tranferencia tranferencia) {
        boolean seguir = true;
        ArrayList<Producto> productos = new ArrayList<>();
        while (seguir) {
            ScannerService sc = new ScannerService();
            System.out.println("Elige el producto que desea comprar: ");
            int eleccion = sc.leerSiguiente();
            TransferenciaService ts = new TransferenciaService();
            System.out.println("Desea Seguir comprando: 1.NO 2.SI");
            ts.almacenarProducto(lista.get(eleccion-1), productos);
            int eleccion2 = sc.leerSiguiente();
            if (eleccion2 == 1){
            seguir = false;
            }
            ts.almacenarProductos(tranferencia,productos);
        }

    }

    @Override
    public void mostrarTicket(Tranferencia tranferencia) {
        System.out.println("------------------------------------------");
        System.out.println("||||||TICKET|||||||||");
        System.out.println("Nro Caja: " + tranferencia.getCaja().getNroCaja());
        System.out.println("Empleado: " + tranferencia.getCaja().getEmpleado().getNombre() + " " +  tranferencia.getCaja().getEmpleado().getApellido());
        TransferenciaService ts = new TransferenciaService();
        ts.mostrarTicket(tranferencia);
        System.out.println("Total Pago: $" +  ts.totalPago(tranferencia));
        System.out.println("|||||||||||||||||||||");
        System.out.println("------------------------------------------");
    }
}
