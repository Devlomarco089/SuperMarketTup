package Domain;

public class Cliente extends Humano{
    private boolean mayorista;

    public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
      super(nombre, apellido, dni);
      this.mayorista = mayorista;
    }
  
    public String toString() {
      return "\n" + super.toString() + "\nMayorista: " + this.mayorista;
    }
  
}