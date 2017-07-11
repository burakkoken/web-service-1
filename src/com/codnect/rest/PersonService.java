package com.codnect.rest;

import com.codnect.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Burak Köken on 11.7.2017.
 */
@Path("/person")
public class PersonService {

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/{param}")
    public Response getPerson(@PathParam("param") String id){
        /* ... */
        Person person = new Person();
        person.setName("Burak Köken");
        person.setAge(22);
        person.setAddress("Kocaeli");

        return Response.status(200).entity(person).encoding("UTF-8").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/")
    public Response getPersonList(){
        /* ... */
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Burak Köken");
        person1.setAge(22);
        person1.setAddress("Kocaeli");

        Person person2 = new Person();
        person2.setName("Şeyma Yılmaz");
        person2.setAge(22);
        person2.setAddress("Kocaeli");

        personList.add(person1);
        personList.add(person2);

        return Response.status(200).entity(personList).encoding("UTF-8").build();
    }




}
