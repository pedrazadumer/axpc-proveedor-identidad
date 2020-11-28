package axpc.micros.identidad.rest.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class ControladorUsuarios {


    @GetMapping("/{usuario}")
    public  obtenerProductor(@PathVariable("usuario") String usuario) {
        return MapeadorProductor.mapearADto(servicioProductores.obtenerProductor(usuario));
    }

}
