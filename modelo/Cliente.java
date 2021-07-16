package modelo;

public class Cliente {
    private String nombreCliente;
    private int numeroTelefonicoCliente;
    private int edadCliente;

    public Cliente(String nombre, int numTel,int edad){
        this.setNombreCliente(nombre);
        this.setNumeroTelefonicoCliente(numTel);
        this.setEdadCliente(edad);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getNumeroTelefonicoCliente() {
        return numeroTelefonicoCliente;
    }
    public void setNumeroTelefonicoCliente(int numeroTelefonicoCliente) {
        this.numeroTelefonicoCliente = numeroTelefonicoCliente;
    }
    public int getEdadCliente() {
        return edadCliente;
    }
    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    
}
