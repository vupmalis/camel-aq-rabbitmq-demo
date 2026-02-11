package org.mydevnotes.messaging.aq;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@ImportResource("${spring.application.context.location}")
public class CamelAqRabbitmqDemoApplication {
	
    private static final Logger logger = (Logger) LoggerFactory.getLogger(CamelAqRabbitmqDemoApplication.class);	

	public static void main(String[] args) {		
		logger.info("Starting AQ-RabbitMQ Demo app");
		SpringApplication.run(CamelAqRabbitmqDemoApplication.class, args);
	}

}
