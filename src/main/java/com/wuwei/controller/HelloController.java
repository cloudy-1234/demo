package com.wuwei.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pxy
 * @date 2024/10/8
 */
@RestController("/hello")
public class HelloController {
    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public String hello(){
        System.out.println("Hello World ~");
        return "Hello World ~";
    }
}
