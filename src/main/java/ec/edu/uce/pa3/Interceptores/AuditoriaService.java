package ec.edu.uce.pa3.Interceptores;

import ec.edu.uce.pa3.Alquiler;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped 
public class AuditoriaService {

    public String realizar( Alquiler alquiler , String metodo) {
        System.out.println(" Realizando alquiler ");
        System.out.println(" Nombre del metodo :" + metodo);
        System.out.println(" Cliente :" + alquiler.getCliente() );
        System.out.println("Vehiculo :" + alquiler.getVehiculo());
        System.out.println(" Dias :" + alquiler.getDias());
        System.out.println(" Precio :" + alquiler.getPrecioDiario() );

        return " Alquiler realizado con exito " ;
    }

}
