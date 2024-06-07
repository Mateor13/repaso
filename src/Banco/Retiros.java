package Banco;

public class Retiros extends Transacciones{
    String fecha, codigo;

    public Retiros() {
    }

    public Retiros(String nombre, String apellido, String cedula, Double dinero, String numeroCuenta, String clave, String cuentaDestino, Double monto, String fecha, String codigo) {
        super(nombre, apellido, cedula, dinero, numeroCuenta, clave, cuentaDestino, monto);
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //Metodos personalizados

    @Override
    public void mostrarDatos() {
        System.out.println("Retiro exitoso");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Fecha: " + getFecha());
        System.out.println("numero Cuenta: " + getNumeroCuenta());
        System.out.println("Monto: " + getMonto());
    }
}
