package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.example.health.TemplateHealthCheck;
import org.example.resources.HelloWorldResource;

public class AppApplication extends Application<AppConfiguration>
{
    public static void main( String[] args ) throws Exception {

        new AppApplication().run(args);
    }

    @Override
    public String getName() {
        return "Hello World!";
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        // TODO
    }

    @Override
    public void run(AppConfiguration conf, Environment env) {
        final HelloWorldResource resource = new HelloWorldResource(conf.getTemplate(), conf.getDefaultName());
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(conf.getTemplate());

        env.healthChecks().register("template", healthCheck);
        env.jersey().register(resource);
    }
}
