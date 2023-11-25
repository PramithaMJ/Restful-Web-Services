package com.pmj.rest.webservices.resfulweb.services.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

//    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
//    public String helloWorld(){
//        return "Hello world";
//    }

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world bean");
    }

    @GetMapping(path = "/hello-world-path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name){
//        return new HelloWorldBean("hello world path variable" + name);
        return new HelloWorldBean(
                String.format("Hello world, %s",name)
        );
    }
}
