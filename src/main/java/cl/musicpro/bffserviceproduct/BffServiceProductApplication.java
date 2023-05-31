package cl.musicpro.bffserviceproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BffServiceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffServiceProductApplication.class, args);
	}

}
