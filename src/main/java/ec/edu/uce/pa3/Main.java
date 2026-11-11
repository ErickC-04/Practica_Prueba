package ec.edu.uce.pa3;

import ec.edu.uce.pa3.Extensiones.ComprobanteDigital;
import ec.edu.uce.pa3.Extensiones.ComprobanteImpreso;
import ec.edu.uce.pa3.Extensiones.DescuentoRegular;
import ec.edu.uce.pa3.Extensiones.DescuentoVip;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject
    AlquilerService alquilerService;
    @Inject
    ComprobanteDigital comprobanteDigital;

    @Inject
    ComprobanteImpreso comprobanteImpreso;

    @Inject
    DescuentoRegular descuentoRegular;

    @Inject
    DescuentoVip descuentoVip;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println(" Iniciando la aplp");
        Alquiler alquiler1 = new Alquiler("Erick", "Che", 10, 100);
        String resultado = alquilerService.realizar(alquiler1, descuentoVip, comprobanteDigital);
        System.out.println(" ressultado");

        Alquiler alquiler2 = new Alquiler("Erick", "Che 2", 10, 100);
        String resultado2 = alquilerService.realizar(alquiler2, descuentoRegular, comprobanteImpreso);
        System.out.println(resultado2);

        Alquiler alquiler3 = new Alquiler("Erick", "Che 3", 10, 100);
        String resultado3 = alquilerService.realizar(alquiler3, descuentoVip, comprobanteImpreso);
        System.out.println(resultado3);

        Alquiler alquiler4 = new Alquiler("Erick", "Che 4", 10, 100);
        String resultado4 = alquilerService.realizar(alquiler4, descuentoRegular, comprobanteDigital);
        System.out.println(resultado4);
        
        return 0;
    }

}
