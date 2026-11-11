package ec.edu.uce.pa3.Interceptores;

import ec.edu.uce.pa3.Alquiler;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Validar 
@Interceptor 
@Priority(Interceptor.Priority.APPLICATION + 1)
public class ValidacionInterceptor {

    @AroundInvoke 
    public Object Validar(InvocationContext context) throws Exception {
        System.out.println("1. Validando ....");
        Object [] parametros = context.getParameters();
        Alquiler alquiler = (Alquiler) parametros[0] ;
        if (alquiler.getDias() < 0 || alquiler.getPrecioDiario() < 0  ) { 
            throw new IllegalArgumentException("El alquiler debe ser mayor a 0 igual el precio ");

    }
return context.proceed();
}
}
