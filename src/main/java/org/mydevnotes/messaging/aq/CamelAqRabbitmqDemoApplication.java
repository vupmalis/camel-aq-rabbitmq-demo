package org.mydevnotes.messaging.aq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class CamelAqRabbitmqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelAqRabbitmqDemoApplication.class, args);
	}

}
