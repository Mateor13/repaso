package Banco;

public class Transacciones extends Cuenta {
    String clave, cuentaDestino;
    Double monto;

    public Transacciones() {
    }

    public Transacciones(String nombre, String apellido, String cedula, Double dinero, String numeroCuenta, String clave, String cuentaDestino, Double monto) {
        super(nombre, apellido, cedula, dinero, numeroCuenta);
        this.clave = clave;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }
    //Getters y Setters

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public double restarDinero(Double transaccion) {
        return transaccion - monto;
    }
    public void transacciones(Double transaccion) {
        System.out.println("Tranferencia exitosa: ");
        double saldoActual = dinero - getMonto();
        System.out.println("Saldo actual"+ transaccion);
        super.setDinero(transaccion);
    }
}
