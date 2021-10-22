package com.pack;

import com.pack.configs.InterceptorConfig;
import com.pack.configs.MongoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created By: Ankit Agarwal
 **/

@Import({MongoConfig.class})
@SpringBootApplication(scanBasePackages = {"com.pack","com.pack.controller","com.pack.handler","com.pack.repository",
                "com.pack.service"})
public class EndTestApplication {

    public static void main(String[] args){
        SpringApplication.run(EndTestApplication.class, args);
    }

}
