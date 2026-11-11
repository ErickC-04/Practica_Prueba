package ec.edu.uce.pa3.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVip implements CalcularDescuento {

    @Override
    public void enviar(double subtotal) {
      System.out.println(" Descuento Vip ");
        System.out.println(" Subtotal " + subtotal); 
    }

}
