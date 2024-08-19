import Boostrap.Boostrasp;
import Domain.Tranferencia;
import Service.MenuService.impl.MenuService;
import Service.ScannerService.Impl.ScannerService;
import Service.TransfreneciaService.impl.TransferenciaService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        MenuService mn = new MenuService();
        Boostrasp bs = new Boostrasp();
        TransferenciaService ts = new TransferenciaService();

        mn.inicioSuper(bs.generarCajas(),ts.nuevaCompra(),bs.generarProductos());
    }
}
