package ec.edu.uce.pa3;

import ec.edu.uce.pa3.Extensiones.CalcularDescuento;
import ec.edu.uce.pa3.Extensiones.Comprobante;
import ec.edu.uce.pa3.Interceptores.Auditoria;
import ec.edu.uce.pa3.Interceptores.Validar;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class AlquilerService {

    @Validar 
    @Auditoria 
    public String realizar( Alquiler alquiler , CalcularDescuento calcularDescuento , Comprobante comprobante ) {
        System.out.println(" Realizando alquiler ");
        System.out.println(" Cliente :" + alquiler.getCliente() );
        System.out.println("Vehiculo :" + alquiler.getVehiculo());
        System.out.println(" Dias :" + alquiler.getDias());
        System.out.println(" Precio :" + alquiler.getPrecioDiario() );

        calcularDescuento.enviar(200);
        comprobante.generar(alquiler, 300);
        return " Alquiler realizado con exito " ;
    }
}
