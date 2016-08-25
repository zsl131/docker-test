package com.zslin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsl-pc on 2016/8/25.
 */
@RestController
public class MainController {

    @RequestMapping(value="/")
    public String index() {

        return "Hello World!";
    }
}
