package mariavv.airlinedirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class AirlineDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirlineDirectoryApplication.class, args);
    }

}
