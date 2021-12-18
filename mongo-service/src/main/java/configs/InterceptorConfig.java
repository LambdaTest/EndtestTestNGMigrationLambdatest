package configs;

import handler.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created By: Ankit Agarwal
 **/

//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    RequestHandler requestHandler;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestHandler);
    }
}
