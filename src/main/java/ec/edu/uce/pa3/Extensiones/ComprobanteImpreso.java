package ec.edu.uce.pa3.Extensiones;

import ec.edu.uce.pa3.Alquiler;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped 
public class ComprobanteImpreso implements Comprobante {

    
    @Override
    public void generar(Alquiler alquiler, double total) {
        System.out.println(" Comprobante Impreso ");
        System.out.println("Alquiler " + alquiler);
        System.out.println(" Precio" + total);
        
        
    }

}
