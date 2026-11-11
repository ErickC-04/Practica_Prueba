package ec.edu.uce.pa3.Interceptores;

import ec.edu.uce.pa3.Alquiler;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import jakarta.ws.rs.ext.Provider;

@Auditoria 
@Interceptor 
@Priority(Interceptor.Priority.APPLICATION + 2)
public class AuditoriaInterceptor {


 @Inject 
 AuditoriaService auditoriaService ;

 @AroundInvoke 
 public Object Auditar (InvocationContext context) throws Exception{

    System.out.println(" 2... Iniciando la Auditoria");
    Alquiler alquiler = (Alquiler) context.getParameters()[0] ;
    String metodo = context.getMethod().getName();
    Object resultado = context.proceed();
   auditoriaService.realizar(alquiler, metodo);
    return resultado ;

 }
}
