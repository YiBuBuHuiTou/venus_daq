package com.cxd.venus.daq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VenusDaqApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenusDaqApplication.class, args);
    }

}
