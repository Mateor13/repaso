package Banco;

public class Depositos extends Cuenta{
    Double monto, cuentaDestino;

    public Depositos() {
    }

    public Depositos(String nombre, String apellido, String cedula, Double dinero, String numeroCuenta, Double monto) {
        super(nombre, apellido, cedula, dinero, numeroCuenta);
        this.monto = monto;
    }
    //Getters y Setters

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public void mostrarDinero() {
        System.out.println("Tranferencia exitosa: ");
        double saldoActual = dinero + this.monto;
        System.out.println("Saldo actual"+ saldoActual);
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Datos del deposito");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Cedula: "+this.getCedula());
        System.out.println("Numero Cuenta: "+this.getNumeroCuenta());
        System.out.println("Monto: "+this.getMonto());
    }
}
