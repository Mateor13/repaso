package Banco;

public class Transferencias extends Transacciones{
    String correo, nombreDestinatario;

    public Transferencias() {
    }

    public Transferencias(String nombre, String apellido, String cedula, Double dinero, String numeroCuenta, String clave, String cuentaDestino, Double monto, String correo, String nombreDestinatario) {
        super(nombre, apellido, cedula, dinero, numeroCuenta, clave, cuentaDestino, monto);
        this.correo = correo;
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }
    //Metodos personalizados
    @Override
    public void mostrarDatos (){

    }
}
