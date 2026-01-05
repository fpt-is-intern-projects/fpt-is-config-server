package fpt.is.bnk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FptIsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FptIsConfigServerApplication.class, args);
    }

}
