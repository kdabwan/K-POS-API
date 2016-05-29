package com.kpos.api;

import com.github.nhuray.dropwizard.spring.SpringBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kameldabwan on 11/22/15.
 */
@Configuration
@ComponentScan
public class KposApplication extends Application<KposConfiguration> {

    public static void main(String[] args) throws Exception {
        new KposApplication().run(args);
    }
    @Override
    public void run(KposConfiguration kposConfiguration, Environment environment) throws Exception {

    }

    @Override
    public void initialize(Bootstrap<KposConfiguration> bootstrap) {
        bootstrap.addBundle(new SpringBundle(applicationContext(), true, true, true));
    }

    private ConfigurableApplicationContext applicationContext(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan(getClass().getPackage().getName());
        return context;
    }
}
