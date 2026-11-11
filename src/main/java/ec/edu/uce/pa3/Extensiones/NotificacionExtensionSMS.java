package ec.edu.uce.pa3.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionSMS  implements NotificacionExtension{


       @Override
    public void enviar(String destinatario, String mensaje) {
       System.out.println("Enviando SMS a :" + destinatario);
       System.out.println("Mensaje " + mensaje);
       System.out.println("Correo enviado con exito ");
        
    }
}
