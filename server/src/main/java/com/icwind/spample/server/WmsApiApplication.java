package com.icwind.spample.server;

import com.icwind.spample.ImplModuleConfiguration;
import com.icwind.spample.rest.RestModuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Import({RestModuleConfiguration.class, ImplModuleConfiguration.class,})
public class WmsApiApplication
        extends SpringBootServletInitializer {

    @Configuration
    @Profile("production")
    @EnableEurekaClient
    public class SpringCloudFeature {
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WmsApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{WmsApiApplication.class}, args);
    }

}
