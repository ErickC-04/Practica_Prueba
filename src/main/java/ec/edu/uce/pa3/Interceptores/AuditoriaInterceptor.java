package ec.edu.uce.pa3.Interceptores;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 2)
public class AuditoriaInterceptor {


    @Inject 
    AuditoriaService auditoriaService ;

    @AroundInvoke 
    public Object Auditar (InvocationContext context) throws Exception {
        System.out.println(" 22222222222222");
        Transferencia transferencia = (Transferencia) context.getParameters()[0];
         String registrar = context.getMethod().getName();
        Object resultado = context.proceed();
        auditoriaService.RealizarTransferencia(transferencia, registrar);
      
        
        return resultado ;
    }

}
