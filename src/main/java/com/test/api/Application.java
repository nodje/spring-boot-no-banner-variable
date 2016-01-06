package com.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

/**
 * The main Java based Spring configuration
 * <p/>
 * Unwanted existing @Configuration class can be excluded like this:
 * <p/>
 * //@EnableAutoConfiguration(exclude = TraceWebFilterAutoConfiguration.class)
 */
@Configuration
@EnableAutoConfiguration//(exclude = TraceWebFilterAutoConfiguration.class)
@ComponentScan("com.test")
public class Application extends AbstractApplication {

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Application.class);
        abstractMain(app, args);
    }
}
