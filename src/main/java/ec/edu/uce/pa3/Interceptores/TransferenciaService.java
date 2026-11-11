package ec.edu.uce.pa3.Interceptores;

import ec.edu.uce.pa3.Extensiones.NotificacionExtension;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class TransferenciaService {

    @Validacion 
    @Auditoria 
    public String RealizarTransferencia(Transferencia transferencia , NotificacionExtension notificacionExtension , String destinatario) {
        System.out.println();
        System.out.println("1. Realizando la transferencia ");
        System.out.println(" Origen" +  transferencia.getOrigen());
        System.out.println(" Destino" + transferencia.getDestino());
        System.out.println("Monto :" + transferencia.getMonto());
        String mensaje = " se a realizado la transferencia " + transferencia.getMonto();
        notificacionExtension.enviar(destinatario, mensaje);
        return " Transferencia realizada correctamente " ;
    }
}
