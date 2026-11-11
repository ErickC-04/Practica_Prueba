package ec.edu.uce.pa3;

import javax.xml.crypto.dsig.TransformService;

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
    public static void main(String[] args) {
        Quarkus.run(Main.class , args);
    }
    public int run (String... args) {
        System.out.println("Iniciando");
        Transferencia transferencia = new Transferencia(null, null, 0);
        String resultado = transferenciaService.RealizarTransferencia(transferencia);
        System.out.println(resultado);
        return 0 ;
    }

 

}
