package consul.cs1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class Cs1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cs1Application.class, args);
	}

}
