package axpc.micros.identidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicioProveedorIdentidad extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicioProveedorIdentidad.class, args);
    }
}
