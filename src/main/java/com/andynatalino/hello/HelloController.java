package com.andynatalino.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author Andy Natalino Lihan
 */
@Controller
@EnableAutoConfiguration
public class HelloController {
    
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Halo Spring Boot";
    }
    public static void main(String[] args) throws Exception{
        SpringApplication.run(HelloController.class, args);
    }
}
