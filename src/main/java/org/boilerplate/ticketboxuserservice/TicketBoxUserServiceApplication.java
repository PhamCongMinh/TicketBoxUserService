package org.boilerplate.ticketboxuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketBoxUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketBoxUserServiceApplication.class, args);
    }

}
