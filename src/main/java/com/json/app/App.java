package com.json.app;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.model.Person;
import com.json.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {

    ObjectMapper map = new ObjectMapper();
    
    Person p = map.readValue(new File("info/Person.json"), Person.class);
    System.out.println(p.getId()+"  "+p.getName());
    System.out.println(p.getAge()+"  "+p.getPhone().getPh1()+p.getPhone().getCode());

    
    }
}
