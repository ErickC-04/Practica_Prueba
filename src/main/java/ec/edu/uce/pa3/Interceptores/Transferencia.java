package ec.edu.uce.pa3.Interceptores;

public class Transferencia {

    private String origen ;
    private String destino ;
    private double monto ;
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public Transferencia(String origen, String destino, double monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }
    public double getMonto() {
        return monto;
    }
    

}
