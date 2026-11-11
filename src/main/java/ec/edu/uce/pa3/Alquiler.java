package ec.edu.uce.pa3;

public class Alquiler {

    private String cliente ;
    private String Vehiculo ;
    private int dias;
   private double precioDiario ;

     public Alquiler(String cliente, String vehiculo, int dias, double precioDiario) {
    this.cliente = cliente;
    this.Vehiculo = vehiculo;
    this.dias = dias;
    this.precioDiario = precioDiario;
   } 
   
   public String getCliente() {
    return cliente;
   }
   public String getVehiculo() {
    return Vehiculo;
   }
   public int getDias() {
    return dias;
   }
   public double getPrecioDiario() {
    return precioDiario;
   }
 
}
