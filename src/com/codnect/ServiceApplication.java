package com.codnect;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Burak Köken on 11.7.2017.
 */
public class ServiceApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        classes.add(com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider.class);
        classes.add(JacksonFeature.class);
        return classes;
    }
}
