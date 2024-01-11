package com.sprigsummer.summer.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test" )
public class TestController {

    @GetMapping(path = "/get-test-1")
    public String getMyTest(){
        String myText = "this is my first spring boot project";
        System.out.println(myText);
        return myText;
    }

    @GetMapping(path = "/get-test-2")
    public String getMyTest2(){
        String myText = "this is my second spring boot project";

        return myText;
    }
}
