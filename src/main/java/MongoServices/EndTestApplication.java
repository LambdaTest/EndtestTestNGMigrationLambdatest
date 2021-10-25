package MongoServices;

import MongoServices.configs.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created By: Ankit Agarwal
 **/

@Import({MongoConfig.class})
@SpringBootApplication(scanBasePackages = {"MongoServices","MongoServices.controller","MongoServices.handler","MongoServices.mongo",
                "MongoServices.service"})
public class EndTestApplication {

    public static void main(String[] args){
        SpringApplication.run(EndTestApplication.class, args);
    }

}
