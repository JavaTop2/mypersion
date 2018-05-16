package com.yc.generator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class hello {

    @RequestMapping("hello")
    public int say(){
        return 7;
    }
}
