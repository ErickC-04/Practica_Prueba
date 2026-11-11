package ec.edu.uce.pa3.Interceptores;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class AuditoriaService {

 public String RealizarTransferencia(Transferencia transferencia , String registro) {
        System.out.println();
        System.out.println("2. Realizando la transferencia auditoria ");
        System.out.println(" Registro :" + registro);
        System.out.println(" Origen :" +  transferencia.getOrigen());
        System.out.println(" Destino :" + transferencia.getDestino());
        System.out.println("Monto :" + transferencia.getMonto());

        return " Registro realizado con exito" ;
}
}
