package com.zia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohammadz on 07/09/2017.
 */
@RestController
public class HelloController {


    @GetMapping("/")
    public String hello() {
        return "Hello!!!";
    }
}
