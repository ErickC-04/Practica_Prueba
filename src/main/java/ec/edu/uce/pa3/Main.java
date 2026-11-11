package ec.edu.uce.pa3;

import javax.xml.crypto.dsig.TransformService;

import ec.edu.uce.pa3.Extensiones.NotificacionExtensionMail;
import ec.edu.uce.pa3.Extensiones.NotificacionExtensionSMS;
import ec.edu.uce.pa3.Extensiones.NotificacionExtensionWhatsApp;
import ec.edu.uce.pa3.Interceptores.AuditoriaService;

import ec.edu.uce.pa3.Interceptores.Transferencia;
import ec.edu.uce.pa3.Interceptores.TransferenciaService;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication     {

    @Inject 
    TransferenciaService transferenciaService ;

    @Inject 
    NotificacionExtensionMail notificacionExtensionMail ;

    @Inject 
    NotificacionExtensionSMS notificacionExtensionSMS ;

    @Inject 
    NotificacionExtensionWhatsApp notificacionExtensionWhatsApp ;
    public static void main(String[] args) {
        Quarkus.run(Main.class , args);
    }
    public int run (String... args) {
        System.out.println("Iniciando");
        Transferencia transferencia = new Transferencia(null, null, 10);
        String resultado = transferenciaService.RealizarTransferencia(transferencia, notificacionExtensionMail, "hola");
        System.out.println(resultado);


         Transferencia transferencia2 = new Transferencia(null, null, 10);
        String resultado2 = transferenciaService.RealizarTransferencia(transferencia, notificacionExtensionSMS, "hola");
        System.out.println(resultado2);


         Transferencia transferencia3 = new Transferencia(null, null, 100);
        String resultado3 = transferenciaService.RealizarTransferencia(transferencia, notificacionExtensionWhatsApp, "hola");
        System.out.println(resultado3);



        return 0 ;
    }

 

}
