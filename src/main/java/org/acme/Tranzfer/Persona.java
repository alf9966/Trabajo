package main.java.org.acme.Tranzfer;

public class Persona {

    String Nombres;
    String Apellidos;
    int Edad;
    Direccion Vivienda = new Direccion("Lima","Javier Prado Este","2965");
    public Persona(String nombres, String apellidos, int edad, String ciudad, String avenida, String numero) {
        super();
        Nombres = nombres;
        Apellidos = apellidos;
        Edad = edad;
        this.Vivienda.setCiudad(ciudad);
        this.Vivienda.setAvenida(avenida);
        this.Vivienda.setNumero(numero);
    }
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String nombres) {
        Nombres = nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public Direccion getVivienda() {
        return Vivienda;
    }
    public void setVivienda(Direccion vivienda) {
        Vivienda = vivienda;
    }



}
