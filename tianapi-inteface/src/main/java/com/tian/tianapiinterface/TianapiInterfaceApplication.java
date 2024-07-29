package com.tian.tianapiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class TianapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianapiInterfaceApplication.class, args);
    }

}
