package jpi.supplyfellow.eurekaserversupplyfellow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSupplyfellowApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSupplyfellowApplication.class, args);
    }

}
