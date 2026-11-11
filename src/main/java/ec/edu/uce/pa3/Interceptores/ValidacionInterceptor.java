package ec.edu.uce.pa3.Interceptores;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Validacion 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 1 )
public class ValidacionInterceptor {


    @AroundInvoke 
    public Object validar (InvocationContext context ) throws Exception {
        System.out.println(" 11111");
        Object[] parametros = context.getParameters() ;
        Transferencia transferencia = (Transferencia) parametros[0];
        if (transferencia.getMonto() < 10 || transferencia.getDestino() == "Erick") {
            throw new IllegalArgumentException("Debe der menor a 5 ");


        }
        System.out.println(" Validacion correecta ");
        return context.proceed();
    }
}
