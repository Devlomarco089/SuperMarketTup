package Domain;

import java.util.ArrayList;

public class Tranferencia {
    private ArrayList<Producto> productos;
    private int total;
    private Caja caja;

    public Tranferencia(int total, Caja caja){
        this.productos = new ArrayList<>();
        this.total = total;
        this.caja = caja;
    }

    public Tranferencia(){

    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
