package main.java.org.acme.Tranzfer;

public class Direccion {
    String Ciudad;
    String Avenida;
    String Numero;
    public Direccion(String ciudad, String avenida, String numero) {
        super();
        this.Ciudad = ciudad;
        this.Avenida = avenida;
        this.Numero = numero;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getAvenida() {
        return Avenida;
    }
    public void setAvenida(String avenida) {
        Avenida = avenida;
    }
    public String getNumero() {
        return Numero;
    }
    public void setNumero(String numero) {
        Numero = numero;
    }


}
