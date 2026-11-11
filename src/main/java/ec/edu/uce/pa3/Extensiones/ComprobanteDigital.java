package ec.edu.uce.pa3.Extensiones;

import ec.edu.uce.pa3.Alquiler;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class ComprobanteDigital implements Comprobante {

    @Override
    public void generar(Alquiler alquiler, double total) {
        System.out.println(" Comprobante digital ");
        System.out.println("Alquiler " + alquiler);
        System.out.println(" Precio" + total);

        
    }


}
