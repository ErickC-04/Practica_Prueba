package ec.edu.uce.pa3.Interceptores;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class TransferenciaService {

    @Validacion 
    @Auditoria 
    public String RealizarTransferencia(Transferencia transferencia) {
        System.out.println();
        System.out.println("1. Realizando la transferencia ");
        System.out.println(" Origen" +  transferencia.getOrigen());
        System.out.println(" Destino" + transferencia.getDestino());
        System.out.println("Monto :" + transferencia.getMonto());

        return " Transferencia realizada correctamente " ;
    }
}
