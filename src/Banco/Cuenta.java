package Banco;

public class Cuenta extends Cliente{
    Double dinero;
    String numeroCuenta;

    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, String cedula, Double dinero, String numeroCuenta) {
        super(nombre, apellido, cedula);
        this.dinero = dinero;
        this.numeroCuenta = numeroCuenta;
    }
    //Getters y Setters

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    //Metodos personalizados
    //Mostrar dinero
    public void mostrarDinero() {
        System.out.println("dinero: " + getDinero());
    }
}
