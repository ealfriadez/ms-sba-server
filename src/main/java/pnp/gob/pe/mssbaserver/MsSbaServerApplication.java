package pnp.gob.pe.mssbaserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class MsSbaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsSbaServerApplication.class, args);
    }

}
