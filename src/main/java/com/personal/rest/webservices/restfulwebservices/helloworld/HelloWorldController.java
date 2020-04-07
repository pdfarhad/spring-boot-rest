package com.personal.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @GetMapping(path = "/hello-world")
    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping(path = "/helloworld/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}