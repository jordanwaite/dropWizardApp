package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<AppConfiguration>
{
    public static void main( String[] args ) throws Exception {

        new App().run(args);
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
        // TODO
    }
}
